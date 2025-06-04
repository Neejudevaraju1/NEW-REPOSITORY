package Exception;

public class Throw_Keyword {
	
	public static void validate(int age) {
		if (age<18) {
			throw new ArithmeticException("Not Eligible");
		}
		else {
			System.out.println("Eligle to vote");
		}
	}

	public static void main(String[] args) {
		validate(21);

	}

}
