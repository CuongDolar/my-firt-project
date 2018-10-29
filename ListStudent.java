package quanlisinhvien;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
public class ListStudent extends student {
    
    private final int MAX_SIZE=50;
    private static int Items=0;
    private student []st=null;	
    Scanner sc=new Scanner(System.in);
    public ListStudent()
    {
    	st=new student[MAX_SIZE];
    	
    }
	public boolean checkIsFull()
	{
		if(Items>=MAX_SIZE)
			return true;
		return false;
		
	}
	public ListStudent(String id, String name, int age, String address,float gpa) 
    {
		     super(id, name, age, address, gpa);
	}
	public void addStudent(student st1)
	{
		if(!checkIsFull())
		{
			this.st[Items]=st1;
			Items++;
			System.out.println("Add student sucsess");
		}
		else
		{
			System.out.println("Full list");
		}
	}
	public void editStudent(String id)
	{
		String name;
		int age;
		String address;
		float gpa;
		boolean find=false;
		int temp=0;
		for(int i=0;i<Items;i++)
		{
			if((this.st[Items].getId()).equals(id))
			{
				find=true;
				temp=i;
				break;
			}
			else
				System.out.print("SV Khong ton tai");
		}
		if(find==true)
		{
			System.out.print("Nhap name moi:");
		   	name=sc.nextLine();
		   	this.st[Items].setName(name);
		   	System.out.print("Nhap age moi:");
		   	age=sc.nextInt();
		   	this.st[Items].setAge(age);
		   	System.out.print("Nhap address moi:");
		   	address=sc.nextLine();
		   	this.st[Items].setAddress(address);
		   	System.out.print("Nhap gpa moi:");
		   	gpa=sc.nextFloat();
		   	this.st[Items].setGpa(gpa);
		   	student st1=new student(id,name,age,address,gpa);
		   	this.st[temp]=st1;
		}
		else
			System.out.println("Khong ton tai ID student");
		
	}
	public void sortStudentByGpa()
	{
		for(int i=0;i<Items-1;i++)
		{
			int min=i;
			for(int j=i+1;j<Items;j++ )
			{
				if((this.st[j].getGpa())<(this.st[min].getGpa()))
					min=j;
			}
			if(i!=min)
			{   
				student A=new student();
				A=this.st[i];
				this.st[i]=this.st[min];
				this.st[min]=A;
			}
		}		
	}
	public void sortStudentByName()
	{
		ArrayList<student> st1=new ArrayList<>();
		for(int i=0;i<Items;i++)
			st1.add(st[i]);
		Collections.sort(st1, new Comparator<student>() 
		{
            @Override
            public int compare(student sv1, student sv2) 
            {
            	
                return (sv1.getName().compareTo(sv2.getName()));
                // Muốn đảo danh sách các bạn đối thành
                //return (sv2.hoTen.compareTo(sv1.hoTen));
            }
        });
		
	}
	public void showListStudent()
	{
		for(int i=0;i<Items;i++)
		{
			System.out.println("Student"+(i+1));
			this.st[i].showInfo();
		}
		    
	}
	public void showListId()
	{
		for(int i=0;i<Items;i++)
		    this.st[i].showId();
			
	}
	public void deleteStudent(String id)
	{
		int temp = 0;
		boolean flag =false;
		for(int i=0;i<Items;i++)
			if(this.st[i].getId().equals(id))
			{
				flag=true;
				temp=i;
				break;
			}
		if(flag==true)
		{
			 this.st[temp]=null;
             Items--;
		}
		else
			System.out.println("Not exists ID:"+id+" in List Student");
	}	
}
