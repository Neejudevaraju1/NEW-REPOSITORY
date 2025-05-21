package package1;

public class Marks {

	public static void main(String[] args) {
int mark=97;
		
		if(mark<=100 && mark >=81) {
			
			System.out.println("Grade A");			
		}
		else if(mark >=71 && mark<=80) {
			
			System.out.println("Grade B");			
	
		}
		else if(mark >=61 && mark<=70) {
			
			System.out.println("Grade C");			
		}
		else if(mark >=40 && mark<=60) {
			System.out.println("Grade D");			
		}
		else if(mark<40) {
			System.out.println("FAILED");			
		}
	
		else {
			System.out.println("enter valid mark");	
		}

	}

}
