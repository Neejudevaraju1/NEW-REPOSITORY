package super_keyword;

public class Flower extends Colour{
String colour ="red";
void show() {
	System.out.println("colour of flower is "+colour);
	System.out.println("colour of flower is "+super.colour);
}
}
