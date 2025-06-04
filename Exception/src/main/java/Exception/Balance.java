package Exception;

public class Balance {
public static void withdraw(int balance,int amount) throws InsufficientFundException{
	if(amount>balance) {
		throw new InsufficientFundException("insufficient fund");
	}else {
		System.out.println("withdrew successfully");
	}
}
	public static void main(String[] args) {
		try {
			withdraw(100,200);
		}catch(InsufficientFundException ex) {
			ex.printStackTrace();
		}

	}

}
