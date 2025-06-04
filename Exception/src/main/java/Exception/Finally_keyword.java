package Exception;

public class Finally_keyword {

	public static void main(String[] args) {
		int data = 50/2;
		System.out.println(data);
		//int x=100/0;
		try {
			int x=100/0;
		}catch(Exception ex) {
			ex.printStackTrace();
		}finally {
			System.out.println("executing finally block");
		}
		System.out.println("rest of the code");
	}
}
