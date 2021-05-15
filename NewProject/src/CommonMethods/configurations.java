package CommonMethods;

import org.openqa.selenium.WebDriver;

public class configurations {

	
	public static WebDriver driver;
	
	private String header="";
	public String getHeader() {
		return header;
	}

	public void setHeader(String header) {
		this.header = header;
	}


	private String writerow="";

	private String closetags="";
	

	public String getClosetags() {
		return closetags;
	}

	public void setClosetags(String closetags) {
		this.closetags = closetags;
	}

	
	
	
	
	
	
	public static WebDriver getDriver() {
		return driver;
	}

	public static void setDriver(WebDriver driver) {
		configurations.driver = driver;
	}

	public String getWriterow() {
		return writerow;
	}

	public void setWriterow(String writerow) {
		this.writerow = writerow;
	}

	/*public static void  loginfo(String expected,String actual,String status)
	{
		configurations config=GlobalConfigurations.configMap.get(Thread.currentThread().getName());
		String row="";
		
	row="<tr><td>"+expected+"</td><td>"+actual+"</td><td>"+status+"</td></tr>";
	
	config.setWriterow(config.getWriterow()+row);
	}

	public static void createTestCaseHeader()
	{
		configurations config=GlobalConfigurations.configMap.get(Thread.currentThread().getName());
		
		String header="<html><body><p align= center><table border=1 id=table1 width=100%>"+
		"<tr><td Colspan=2 bgcolor=#C6D0D1>Test Case Name:</td></tr></table>"+
		"<p align=center><b><table border=1 id=table1 width=100%>"+
		"<tr><td>Expected</td><td>Actual</td><td>Status</td></tr>";
		config.setHeader(header);
	}
	
	
	public static void closetestCase()
	{
		configurations config=GlobalConfigurations.configMap.get(Thread.currentThread().getName());
		
		String closeTags="</table></body></html>";
		
		config.setClosetags(closeTags);
	}*/
}
