package Java_package;

public class Stringbuffer_Demo {

	public static void main(String[] args) {
		StringBuffer s= new StringBuffer("Hello");
		s.append(" " +"world");
		System.out.println(s);
		StringBuffer sb= new StringBuffer("nw");
		sb.insert(1, "e");
		System.out.println(sb);
		StringBuffer sb1=new StringBuffer("Hello To World");
		sb1.replace(6, 8, "java");
		System.out.println(sb1);
		StringBuffer sb2=new StringBuffer("hello to world");
		sb2.delete(6, 8);
		System.out.println(sb2);
		s.reverse();
		System.out.println(s);
		StringBuffer sb3=new StringBuffer();
		sb3.append("hello to new java world");
		sb3.capacity();
		System.out.println(sb3.capacity());
		sb3.toString();
		System.out.println(sb3);
	}

}
