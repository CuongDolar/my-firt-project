package quanlisinhvien;

public class student {
     public String id;
     public String name;
     public int age;
     public String address;
     public float gpa;
      student()
      {}
    public student(String id, String name,int age,String address,float gpa) 
    {
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
		this.gpa = gpa;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public float getGpa() {
		return gpa;
	}
	public void setGpa(float gpa) {
		this.gpa = gpa;
	}
	public void showInfo()
	{
		
		System.out.println("ID:\t"+getId());
		System.out.println("Name:\t"+getName());
		System.out.println("Age:\t"+getAge());
		System.out.println("Address:\t"+getAddress());
		System.out.println("Gpa:\t"+getGpa());
		System.out.println("/*********/");
	}
	public void showId()
	{
		System.out.println("ID:\t"+getId());
	}
}
