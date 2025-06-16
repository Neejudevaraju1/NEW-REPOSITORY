package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterativeDemo {

	public static void main(String[] args) {
		List<String> li = new ArrayList<String>();
		li.add("TOM & Jerry");
		li.add("Looney Tunes");
		li.add("Chotta Bheem");
		Iterator<String>it= li.iterator();
		while(it.hasNext()) {
			String cartoon=it.next();
			System.out.println(cartoon);
		}
	}

}
