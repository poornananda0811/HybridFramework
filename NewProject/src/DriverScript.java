import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class DriverScript implements Runnable{
	
public static String key;

public DriverScript(String key)
{
	this.key=key;
}
@Override
public void run()
{
	String className=null;
	String methodName=null;
	String names[]=key.split("\\.");
	className=names[0];
	methodName=names[1];
	String packageName="TestClasses";
	Class class1=null;
	try
	{
		class1=class1.forName(packageName+"."+className);
	}
	catch(ClassNotFoundException e)
	{
		e.printStackTrace();
	}
	
	Method m=null;
	
	try
	{
		m=class1.getDeclaredMethod(methodName,null);
	}
	catch(NoSuchMethodException e)
	{
		e.printStackTrace();
	}
	try
	{
		Object o=m.invoke(null,null);
	}
	catch(IllegalAccessException e)
	{
		
	} catch (IllegalArgumentException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (InvocationTargetException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
