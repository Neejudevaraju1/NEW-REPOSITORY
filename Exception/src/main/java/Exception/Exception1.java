package Exception;

public class Exception1 {

	public static void main(String[] args) {
try {
		int x=6/0;
System.out.println("rest of the code");
System.out.println(x);
}catch(ArithmeticException Ex) {
	//System.out.println("error");
	System.out.println(Ex.getMessage());
	Ex.printStackTrace();
}
System.out.println("hello");
System.out.println("java exception handling");
}

}
