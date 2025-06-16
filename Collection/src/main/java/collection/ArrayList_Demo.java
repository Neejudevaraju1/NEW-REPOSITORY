package collection;

import java.util.ArrayList;

public class ArrayList_Demo {

	public static void main(String[] args) {
		ArrayList<String> cars =new ArrayList<String>();
cars.add("volvo");
cars.add("bmw");
cars.add("ford");
cars.add(3, "ferrari");    //where volvo,bmw etc are saved as objects 
System.out.println(cars);
cars.get(2); // to get the data in that particular index
System.out.println(cars.get(2));
cars.set(1, "BMW");      // to modify the  array with that data in that particular index
System.out.println(cars.get(1));
cars.remove(3);  // to remove the value of that particular index
cars.size();   // to get the size of the array
System.out.println(cars.size());
//cars.clear();// to clear the array
System.out.println(cars.contains("ford"));   // to check whether the value is present in the list

	}

}
