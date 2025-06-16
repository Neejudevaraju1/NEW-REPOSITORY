package excelread;

public class ExcelMain {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String s=ExcelData.readStringData(0, 1);
		System.out.println(s);
		String s1=ExcelData.readIntegerData(1, 0);
		System.out.println(s1);
		String s2=ExcelData.readStringData(1,1);
		System.out.println(s2);

	}


	}


