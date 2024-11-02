package helpers;

import java.awt.RenderingHints.Key;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class propertiesDataManagr {
	String filePath ="C:\\Users\\engre\\OneDrive\\Documents\\GitHub\\DCCProject\\utils\\data.properties";
	
	public String getProperty(String Key) throws IOException {
		Properties prop = new Properties();
		InputStream input= new FileInputStream(filePath);
		prop.load(input);
		return prop.getProperty(Key);
		
	}
	}


