package package1;

public class SumofElements {

	public static void main(String[] args) {
		int []a= {10,20,34,78};
		int sum =0;
		for (int i =0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		sum=sum+a[i];	
		}
		System.out.println();
		System.out.println("sum of the elements is :"+sum);
	}

}
