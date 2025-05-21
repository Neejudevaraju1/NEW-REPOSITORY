package package1;

public class Countword {

	public static void main(String[] args) {
		String msg="welcome to the world of java";
		System.out.println("the entered string is : "+ msg);
		String[]array=msg.split("\s");
		int count = array.length;
System.out.println("number of words in the sentense is "+count);
		
	}

}
