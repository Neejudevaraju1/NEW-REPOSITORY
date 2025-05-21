package day18;

public class protected_main extends Protected_demo {

	public static void main(String[] args) {
		Protected_demo demo = new Protected_demo();
		demo.msg();
demo.print();//calling default method in same package: "default access modifier"
	}

}
