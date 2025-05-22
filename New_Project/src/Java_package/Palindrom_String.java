package Java_package;

public class Palindrom_String {

	public static void main(String[] args) {
		StringBuffer Strg=new StringBuffer("Malayalam");
		String Strg1=Strg.toString();
		System.out.println("The entered string is : "+Strg1);
		Strg.reverse();
		String Strg2= Strg.toString();
		System.out.println("The reverse string is : "+Strg2);
		System.out.println(Strg1.equalsIgnoreCase(Strg2));
		if (Strg1.equalsIgnoreCase(Strg2))
		{
			System.out.println("the string is palindrome");
		}else {
			System.out.println("the string is not palindrome");
		}

	}

}
