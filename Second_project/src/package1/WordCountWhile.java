package package1;

public class WordCountWhile {

	public static void main(String[] args) {
		String msg ="welcome to the world of java";
		System.out.println("The entered String is "+msg);
		int count =1;
		int i=0;
		while(i<msg.length()) {
			if (msg.charAt(i)==' '&& msg.charAt(i+1)!=' ') {
				
				count ++;
			}
			i++;
			
		}
		System.out.println("The count of words in the given string is :" +count);
	}
	

}
