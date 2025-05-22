package Java_package;

public class Pyramid_star {
	public static void main(String[] args) {
		int row=5;int k=0;
		for(int i=1;i<=row;i++,k=0) {
			for(int space=1;space<=row-i;space++) {
				System.out.print(" ");
			}
			while(k!=2*i-1) {
				System.out.print("*");
				k++;
			}
			System.out.println();
		}

	}

}
