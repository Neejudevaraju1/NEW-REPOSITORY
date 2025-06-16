package collection;

import java.util.ArrayList;
import java.util.List;

public class NonGeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List li=new ArrayList();
li.add(23);
li.add("name");
li.add("cartoon");
String s =(String)li.get(1);
String s1=(String)li.get(2);
int num =(Integer)li.get(0);
System.out.println(s +" "+s1+" " +num);
System.out.println(li);
	}

}
