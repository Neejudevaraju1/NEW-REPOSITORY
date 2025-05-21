package package1;

public class Fibanocci {

	public static void main(String[] args) {
		int n=10;
		int num1=0;
		int num2=1;
		System.out.print(num1+" "+num2);
		for(int i=0;i<=n;i++) {
			int num3=num1+num2;
			System.out.print(" "+num3);
			num1=num2;
			num2=num3;
		}
	}

}
