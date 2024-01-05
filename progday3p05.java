class Student1
{
private String name;
private String class1;
private String sec;
private String rollno;
private String subject;
private String collage_name;
public void setName(String name)
{
this.name=name;
}
public String getName()
{
return name;
}
public void setClass1(String class1)
{
this.class1=class1;
}
public String getClass1()
{
return class1;
}
public void setSec(String sec)
{
this.sec=sec;
}
public String getSec()
{
return sec;
}
public void setRollno(String rollno)
{
this.rollno=rollno;
}
public String getRollno()
{
return rollno;
}
public void setSubject(String subject)
{
this.subject=subject;
}
public String getSubject()
{
return subject;
}
public void setCollage_name(String collage_name)
{
this.collage_name=collage_name;
}
public String getCollage_name()
{
return collage_name;
}
}

class BCA4
{
public static void main(String[] args)
{
Student1 ob=new Student1();
ob.setName("Chandana");
System.out.println("Name:"+ob.getName());
ob.setClass1("I AI&DS");
System.out.println("Class:"+ob.getClass1());
ob.setSec("A Section");
System.out.println("Sec:"+ob.getSec());
ob.setRollno("22HR1A3026");
System.out.println("Rollno:"+ob.getRollno());
ob.setSubject("JAVA");
System.out.println("Subject:"+ob.getSubject());
ob.setCollage_name("Mother Theresa Institute Of Engineering And Technology");
System.out.println("Collagename:"+ob.getCollage_name());
}
}