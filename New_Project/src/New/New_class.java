package New;

import day18.Protected_demo;

public class New_class extends Protected_demo {
	public void display() {
		msg();
	}

	public static void main(String[] args) {
		 
		New_class c=new New_class();
	//	c.msg();
		c.display();
		System.out.println(c.num);
		//c.print();//calling default method to a class in different package
	}

}
