package library_files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class UtilityClass 
{
	public static String getPFdata(String key) throws IOException 
	{  
		FileInputStream file=new FileInputStream("E:\\Software Testing Rahul\\Eclipse\\Programs\\Introduction_to_GitHub_Project\\login.properties");
	    Properties p=new Properties();
	    p.load(file);
	    return p.getProperty(key);
	
	}

}
