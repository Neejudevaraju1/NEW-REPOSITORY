package package1;

import java.util.Arrays;

public class SmallestNumber {
	int arr[]= {10,50,2,11,25,10,15};
	int min=arr[0];
	void min() {
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<min){
			min=arr[i];
			}
			}		
		System.out.println("Smallest number in the array is "+arr[0]);
		}
	public void sort() {
		Arrays.sort(arr);
		for (int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	//System.out.println("sorted array"+Arrays.toString(arr));
		
	}
	public static void main(String[] args) {
		SmallestNumber s=new SmallestNumber();
		s.min();
		s.sort();
	}

}
