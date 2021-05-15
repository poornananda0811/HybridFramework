import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;
import CommonMethods.configurations;

public class BaseClass {
	
	public static void main(String[] args) throws FilloException, InterruptedException {
		// TODO Auto-generated method stub
		
		
		List<String> tcMethods=new ArrayList<String>();
		Fillo fillo=new Fillo();
		Connection connection=fillo.getConnection( System.getProperty("user.dir")+"\\Jars\\TestManager.xlsx");
		String strQuery="Select * from Sheet1 where Execution=True";
		Recordset recordset=connection.executeQuery(strQuery);
		 
		while(recordset.next()){
		System.out.println(recordset.getField("TestCasename"));
		System.out.println(recordset.getField("TestCaseMethod"));
		tcMethods.add(recordset.getField("TestCaseMethod"));
		}
		 
		recordset.close();
		connection.close();
	

	ExecutorService executor=Executors.newFixedThreadPool(2);
	
	for(int i=0;i<tcMethods.size();i++)
	{
		System.setProperty("webdriver.ie.driver",System.getProperty("user.dir")+"//Jars//IEDriverServer.exe");
		WebDriver wd=new InternetExplorerDriver();
		configurations.setDriver(wd);
		executor.submit(new DriverScript(tcMethods.get(i)));
		Thread.sleep(3000);
	}
	}
}
