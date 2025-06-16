package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		Set<String> fruits=new HashSet<>();
		fruits.add("orange");
		fruits.add("Mango");
		fruits.add("Apple");
		fruits.add("Banana");
		Set<String>vegitables = new HashSet<>();
		vegitables.add("tomato");
		vegitables.add("chilli");
		System.out.println(fruits.addAll(vegitables));
		System.out.println(fruits);
		
		Iterator<String> ir =fruits.iterator();
while(ir.hasNext()) {
	System.out.println(ir.next());
}
	}

}
