package New;

public class Student {
	static String department="mechanical engineering";
	static int age=26;
	float Mark;
    String clg;
    char grade;
   
    	
    
public String display(String clg,char grade,float mark) {
     this. Mark=mark;
     this.clg=clg;
     this.grade=grade;
     System.out.println(Mark);
     System.out.println(grade);
	return clg;
}
public static void print(String name) {

System.out.println(name);
System.out.println(department);
System.out.println(age);
}
	public static void main(String[] args) {	
Student st=new Student();
String s=st.display("CET",'A',79.5f);
System.out.println(s);
  print("Rahul");
	}

}
