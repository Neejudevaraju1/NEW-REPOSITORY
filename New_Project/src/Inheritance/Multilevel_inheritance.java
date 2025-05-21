package Inheritance;

public class Multilevel_inheritance {
String clgname="CET";
void display() {
	System.out.println(clgname);
}
}
class Course extends Multilevel_inheritance{
	String course = "B-tech";
	void print() {
		System.out.println(course);
	}
}
class Batch extends Course  {
	String batch="Mechanical engineering";
	void batch() {
		System.out.println(batch);
	}
}
class Student extends Batch {
	String sname ="Rahul";
	void name() {
		System.out.println(sname);
	}
		void student_details() {
			System.out.println(sname+ " "+batch+ " "+course+ " "+clgname);
			
		}
	}
