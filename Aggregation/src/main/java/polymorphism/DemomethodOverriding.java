package polymorphism;

public class DemomethodOverriding {

	public static void main(String[] args) {
		Doctor doc =new Doctor();
		doc.treatPatient();
		Surgen su =new Surgen();
		su.treatPatient();
    
	}

}
