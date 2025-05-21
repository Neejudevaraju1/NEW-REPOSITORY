package super_keyword;//super keyword used to call the constructor of immediate super class

public class College extends Student {
	College(){
		super(); //called to get the constructor of immediate super class, should be called first
		System.out.println("constructor of sub class");
	}

}
