package Exception;

public class ValidateAge {

	public static void validate(int age) throws InvalidAgeException {
		if(age<18) {
			throw new InvalidAgeException("Not eligible to register");
		}else {
			System.out.println("eligile to register");
		}
	}
	public static void main(String[] args) {
		try {
			validate(6);
		}catch (InvalidAgeException ex) {
			ex.printStackTrace();
		}
				

	}

}
