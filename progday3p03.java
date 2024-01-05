class Student
{
private int id;
private String name;
public void setId(int id){this.id=id;}
public int getId(){return id;}
public void setName(String name){this.name=name;}
public String getName(){return name;}
}
class BCA2 
{
public static void main(String args[])
{
Student ob=new Student();
ob.setId(3026);
System.out.println("Id:"+ob.getId());
ob.setName("Chandana");
System.out.println("Name:"+ob.getName());
}
}
