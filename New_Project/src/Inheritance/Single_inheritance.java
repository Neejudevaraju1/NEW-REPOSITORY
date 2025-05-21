package Inheritance;

public class Single_inheritance {
float Salary=50000;
void print()
{
	System.out.println("salary of the employee is "+Salary);
}
}
class Bonus extends Single_inheritance{
	int bonus=1000;
	void print_details() {
		System.out.println("Bonus of the employee is"+bonus);
	}
}