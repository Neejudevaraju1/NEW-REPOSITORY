package Aggregation;

public class Aggregate {

	public static void main(String[] args) {
		Author Au = new Author("JK ROWLING",56,"SCOTLAND");
		Book bk =new Book("HARRY POTTER",999,Au);
System.out.println(bk.Bname);
System.out.println(bk.price);
System.out.println(bk.author.Name);
System.out.println(bk.author.Age);
System.out.println(bk.author.Place);
	}

}
