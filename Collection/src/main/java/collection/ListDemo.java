package collection;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
	List<String> L= new ArrayList<String>();
L.add("AIR");
L.add("EARTH");
L.add("SKY");
/*for(String i:L) {
	System.out.println(i);
}*/
for(int i=0;i<L.size();i++) {
	System.out.println(L.get(i));
}
	}

}
