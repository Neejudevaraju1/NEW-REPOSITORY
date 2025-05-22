package super_keyword;

public class Students {
	String name;
	int age;
Students(){
	//System.out.println("default constructor");
	this("john",26);
	
}
Students(String name, int age){
	System.out.println("parameterized constructor");
	this.name =name;
	this.age = age;
	}
Students(String name){
	this.name =name;
	
}
public void show() {
	System.out.println(name+age);
}
}
