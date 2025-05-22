package java_Aggregate;

public class Aggregate {

	public static void main(String[] args) {
		College cg = new College("BARTON HILL","TRIVANDRUM");
		Department dp=new Department("MECHANICAL",465,"JOSEPH");
        Student s= new Student("henry",26,dp,cg);
      s.display();
	}

}
