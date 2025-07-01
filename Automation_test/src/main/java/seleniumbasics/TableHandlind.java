package seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TableHandlind extends Base{
	public void tableData() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement data= driver.findElement(By.xpath("//table[@id='dtBasicExample']"));
		System.out.println(data.getText());
	}
	public void printSingleRow() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement rowdata=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[2]"));
		System.out.println(rowdata.getText());
	}
	public void printSingleData() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement SingleData=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[2]/td[2]"));
		System.out.println(SingleData.getText());
	}
	public void printColumn() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		List<WebElement> columndata=driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[3]"));
		for(WebElement i:columndata) {
			System.out.println(i.getText());
		}
	}
	public void searchValue() {
		String input="Garrett Winters";
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		List<WebElement> datatable =driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[1]"));
		for(WebElement j:datatable) {
			if(j.getText().equals(input)) {
				System.out.println(j.getText());
			}
		}
	}

	public static void main(String[] args) {
		TableHandlind table =new TableHandlind();
		table.browserInitialisation();
		table.tableData();
		System.out.println("*************************************************************");
		table.printSingleRow();
		System.out.println("*************************************************************");
		table.printSingleData();
		System.out.println("*************************************************************");
		table.printColumn();
		System.out.println("*************************************************************");
		table.searchValue();
	}

}
