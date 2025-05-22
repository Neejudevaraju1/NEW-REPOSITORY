package Java_package;

public class Private_demo {
	
	private String s;
	private int num=10;
	private Private_demo(String s) {
		this.s=s;
		System.out.println(s);
	}
	private void display() {
		System.out.println(num);
	}

	public static void main(String[] args) {
		
Private_demo demo=new Private_demo("string");
demo.display();
	}

}
