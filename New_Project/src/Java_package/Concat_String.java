package Java_package;

public class Concat_String {
	
	public void chart_At() {
		String char_at ="new character";
		System.out.println(char_at.charAt(5));
	}
public void length() {
	String length ="length of the string";
	System.out.println(length.length());
}
public void replace() {
	String replace=" new java program";
	System.out.println(replace.replace("new","existing"));
}
public void concat() {
	String s1= "java";
	String s2 ="class";
	System.out.println(s1+s2);
	System.out.println(s1.concat( s2));
}
public void substring() {
	String s3="welcome to java";
	System.out.println(s3.substring(4));
	System.out.println(s3.substring(0, 8));
}
public void value() {
	int num=56;
	System.out.println(String.valueOf(num));
	String num2=String.valueOf(num);
	System.out.println(50+num2);
}

	public static void main(String[] args) {
		
		String s3="welcome to java";
		System.out.println(s3.substring(4));
		System.out.println(s3.substring(0, 8));
	
System.out.println(s3.toUpperCase());
String s4= s3.toUpperCase();
System.out.println(s4);
System.out.println(s4.toLowerCase());
String s5= "   welcome   ";
System.out.println(s5.trim());
System.out.println(s3.startsWith("we"));
System.out.println(s3.endsWith("va"));
System.out.println(s3.startsWith("WE"));
Concat_String c= new Concat_String();
c.chart_At();
c.length();
c.replace();
c.concat();
c.substring();
c.value();
	}

}
