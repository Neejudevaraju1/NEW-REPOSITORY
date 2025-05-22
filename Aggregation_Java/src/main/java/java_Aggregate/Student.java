package java_Aggregate;

public class Student {
String Sname;
int Rollno;
College college;
Department department;
Student(String name,int roll,Department department,College college){
	this.Sname=name;
	this.Rollno=roll;
	this.department=department;
	this.college=college;
}
void display() {
System.out.println(Sname);	
System.out.println(Rollno);
System.out.println(department.Department);
System.out.println(department.Dpt_ID);
System.out.println(department.HOD);
System.out.println(college.Cname);
System.out.println(college.Place);	
}
}
