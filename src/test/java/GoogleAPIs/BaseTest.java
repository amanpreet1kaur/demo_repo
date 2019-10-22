package GoogleAPIs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.BeforeSuite;

import io.restassured.RestAssured;

public class BaseTest {
	public Properties prop;
	 
	@BeforeSuite
	public void init() throws IOException {
		// get the File path
		String filePath = System.getProperty("user.dir")+
				"\\src\\main\\java\\Config\\configuration.properties";
		FileInputStream fis = new FileInputStream(filePath);
		
		//Read From properties File
		prop = new Properties();
		prop.load(fis);
		 
		
		
		
	}
}
