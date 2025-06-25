package seleniumbasics;

public class BrowserCommands extends Base {
public void browserCommands() {
	String title=driver.getTitle();

	System.out.println(title);
	String url=driver.getCurrentUrl();
	System.out.println(url);
	String source=driver.getPageSource();
	System.out.println(source);
}
	public static void main(String[] args) {
		BrowserCommands browser= new BrowserCommands();
		browser.browserInitialisation();
		browser.browserCommands();

	}

}
