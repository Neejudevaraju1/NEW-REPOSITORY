package Java_package;

public class String_compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="java";
String s2="JAVA";
String s3 = new String("java");
String s4="java";
System.out.println(s1.equalsIgnoreCase(s2));
System.out.println(s1.equals(s3));
System.out.println(s1==s2);
System.out.println(s1==s3);
System.out.println(s1==s4);

	}

}
