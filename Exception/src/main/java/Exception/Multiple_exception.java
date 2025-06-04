package Exception;

public class Multiple_exception {

	public static void main(String[] args) {
		
	try {
		int array[]=new int[5];
			array[6]=6/0;
	System.out.println("rest of the code");
	System.out.println(array[6]);
	}catch(ArithmeticException Ex) {
		//System.out.println("error");
		System.out.println(Ex.getMessage());
		Ex.printStackTrace();
	}catch(ArrayIndexOutOfBoundsException ae) {
		System.out.println(ae.getMessage());
		ae.printStackTrace();
	}
	System.out.println("hello");
	System.out.println("java exception handling");
	}


	

}
