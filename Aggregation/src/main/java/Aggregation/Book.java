package Aggregation;

public class Book {
String Bname;
int price;
Author author;
Book(String name,int price,Author author){
	this.Bname=name;
	this.price=price;
	this.author=author;
}
void display() {
	System.out.println(Bname);
	System.out.println(price);
	System.out.println(author.Name);
	System.out.println(author.Age);
	System.out.println(author.Place);
}
}
