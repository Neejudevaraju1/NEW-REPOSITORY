package multiple_interface;

public class Animal implements Cat,Dog{
public void display() {
	System.out.println("WE ARE DOING MULTIPLE INHERITENCE USING INTERFACE");
}
public void show() {
	System.out.println("DOG IS A DOMESTIC ANIMAL MAINLY GROMED TO GUARD HOUSE AS WELL AS A PET");
}
public void habitat() {
System.out.println("CAT IS A DOMESTIC ANIMAL MAINLY KEEP AS PET FOR SHOW");	
}
}
