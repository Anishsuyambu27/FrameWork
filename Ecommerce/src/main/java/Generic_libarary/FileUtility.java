package Generic_libarary;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {
	
	public static String getProperty(String key) throws IOException
	{
		FileInputStream fis=new FileInputStream("./src/test/resources/CommonData.properties");
		
		Properties poject=new Properties();
		
		poject.load(fis);
		
		return poject.getProperty(key);
	}

}
