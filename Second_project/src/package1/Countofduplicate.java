package package1;

public class Countofduplicate {

	public static void main(String[] args) {
		int []a= {1,10,34,20,34,78,34,10,10,4,10};
		int count =0;
		int num=10;
		for(int i=0;i<a.length;i++) {
			if(a[i]==num) {
				count++;
			}
		}
System.out.println("number of duplicate entries is :" +count);
	}

}
