package TestClasses;

import org.openqa.selenium.WebDriver;

import CommonMethods.configurations;

public class SecondClass {
	public static WebDriver wd=null;
	public static void Method1()
	{
		
		
		
		wd=configurations.getDriver();
		
		wd.get("https://www.google.com");
		
		System.out.println("The title of the page is"+wd.getTitle());
		
		wd.quit();
	}
	
	public static void Method2()
	{
		
	
		
		
		wd=configurations.getDriver();
		
		wd.get("https://www.yahoo.com");
		
		System.out.println("The title of the page is"+wd.getTitle());
		
		wd.quit();
	}
}
