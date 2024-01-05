class Student1
{
private String collage_name;
private String collage_address;
private int ay_start;
private int ay_end;
private int id;
private String name;
private String course_name;
private String  aadhar_no;
public void setCollage_name(String collage_name){this.collage_name=collage_name;}
public String getCollage_name(){return collage_name;}
public void setCollage_address(String collage_address){this.collage_address=collage_address;}
public String getCollage_address(){return collage_address;}
public void setAy_start(int ay_start){this.ay_start=ay_start;}
public int getAy_start(){return ay_start;}
public void setAy_end(int ay_end){this.ay_end=ay_end;}
public int getAy_end(){return ay_end;}
public void setId(int id){this.id=id;}
public int getId(){return id;}
public void setName(String name){this.name=name;}
public String getName(){return name;}
public void setCourse_name(String course_name){this.course_name=course_name;}
public String getCourse_name(){return course_name;}
public void setAadhar_no(String aadhar_no){this.aadhar_no=aadhar_no;}
public String getAadhar_no(){return aadhar_no;}
}
class BCA3
{
public static void main(String[] args)
{
Student1 ob=new Student1();
ob.setCollage_name("Mother Theresa Institute Of Engineering And Technology");
System.out.println("Collage name:"+ob.getCollage_name());
ob.setCollage_address("Melumoi,Palamaner");
System.out.println("Collage address:"+ob.getCollage_address());
ob.setAy_start(2022);
System.out.println("Academic year start:"+ob.getAy_start());
ob.setAy_end(2026);
System.out.println("Academic year end:"+ob.getAy_end());
ob.setId(3026);
System.out.println("Id:"+ob.getId());
ob.setName("Chandana");
System.out.println("Name:"+ob.getName());
ob.setCourse_name("AI&DS");
System.out.println("Course:"+ob.getCourse_name());
ob.setAadhar_no("230583720602");
System.out.println("Aadhar no:"+ob.getAadhar_no());
}
}
