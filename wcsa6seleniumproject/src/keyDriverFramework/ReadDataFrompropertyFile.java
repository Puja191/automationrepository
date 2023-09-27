package keyDriverFramework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFrompropertyFile {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("./data/config.properties"); 
		
		   Properties prop = new Properties();
		   //make the file ready to read
		   prop.load(fis);
		   //read property file
		       String propertyData = prop.getProperty("Username");
		       
		       System.out.println(propertyData);
	}
}
