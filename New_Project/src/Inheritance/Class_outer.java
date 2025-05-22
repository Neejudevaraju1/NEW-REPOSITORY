package Inheritance;

public class Class_outer {
	public class Inner{
		public void display() {
			System.out.println("test");
		}
	}
public static void main(String[]args) {
	Class_outer outer =new Class_outer();
	Class_outer.Inner inner = outer.new Inner();
	inner.display();
}
}
