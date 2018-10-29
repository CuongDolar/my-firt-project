package quanlisinhvien;
import java.util.Scanner;
public class Main {
	//private static ListStudent obj=new ListStudent();
	static ListStudent list=new ListStudent();
    static Scanner sc=new Scanner(System.in);
	public static void print(String st)
	{
		System.out.println(st);
	}
	public static void chooseItems()
	{
		print("/************************/");
		print("1. Add student.");
		print("2. Edit student by id.");
		print("3. Delete student by id.");
		print("4. Sort student by gpa.");
		print("5. Sort student by name.");
		print("6. Show student.");
		print("0. Exit.");
		print("/************************/");
		print("Please choose a Number :");
	}
	public static void editStudent()
	{
		String id;
		print("Nhap ID student muon edit");
		id=sc.nextLine();
		list.editStudent(id);
		
	}
	public static void deleteStudent()
	{
		String id;
		print("Nhap ID student muon edit :");
		sc.nextLine();
		id=sc.nextLine();
		list.deleteStudent(id);
	}
	
	public static void showStudent()
	{
		list.showListStudent();
	}
	public static void addStudent()
	{
		  String id;
	      String name;
	      int age;
	      String address;
	      float gpa;
	      
	      print("Nhap ID:");
	      sc.nextLine();
	      id=sc.nextLine();
	      
	      print("Nhap name:");
	      
	      name=sc.nextLine();
	      
	      print("Nhap age:");
	      age=sc.nextInt();
	
	      sc.nextLine();
	      print("Nhap address:");
	      address=sc.nextLine();
	      
	      print("Nhap gpa:");
	      gpa=sc.nextFloat();
	      
	      student st1=new student(id,name,age,address,gpa);
	      list.addStudent(st1);
	 
	}
	public static void showListId()
	{
		list.showListId();
		
	}
	public static void sortStudentByGpa()
	{
		list.sortStudentByGpa();
	}
	public static void sortStudentByName()
	{
		list.sortStudentByName();
	}
	
	
	public static void main(String[] args) {
		int k;
		boolean flag=true;
		while(flag)
		{
			chooseItems();
			k=sc.nextInt();
			
		  switch(k)
		  {
		  case 1:
			  addStudent();
			  flag=true;
			  break;
		  case 2:
			  editStudent();
			  flag=true;
			  break;
		  case 3:
			  deleteStudent();
			  flag=true;
			  break;
		  case 4:  
			  sortStudentByGpa();
			  flag=true;
			  break;
		  case 5:
			  sortStudentByName();
			  flag=true;
			  break;
		  case 6:
			  showStudent();
			  flag=true;
			  break;
		  case 0:
			  print("Thoat khoi chuong trinh");
			  flag=false;
		  }
		}
	}
}
