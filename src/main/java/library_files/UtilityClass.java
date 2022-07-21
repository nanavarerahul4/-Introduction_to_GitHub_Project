package library_files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class UtilityClass 
{
	public static String getPFdata(String key) throws IOException 
	{  
		FileInputStream file=new FileInputStream("C:\\Users\\Admin\\git\\-Introduction_to_GitHub_Project\\Kite.properties");
	    Properties p=new Properties();
	    p.load(file);
	    System.out.println(p.getProperty(key));
	    return p.getProperty(key);
	
	}

}
