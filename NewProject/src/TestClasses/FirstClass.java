package TestClasses;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import CommonMethods.configurations;

public class FirstClass {
public static WebDriver wd=null;
	public static void Method1()
	{
			
		
		wd=configurations.getDriver();
		
		wd.get("https://www.youtube.com");
		
		System.out.println("The title of the page is"+wd.getTitle());
		
		wd.quit();
	}
	
	public static void Method2()
	{
		
		
		wd=configurations.getDriver();
		
		wd.get("https://www.cricinfo.com");
		
		System.out.println("The title of the page is"+wd.getTitle());
		
		wd.quit();
	}
}
