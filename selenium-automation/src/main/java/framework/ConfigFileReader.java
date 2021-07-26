package framework;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
 
public class ConfigFileReader {
 
	private Properties properties;
	private final String propertyFilePath= "configs//Configuration.properties";
 
	public ConfigFileReader(){
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(propertyFilePath));
			properties = new Properties();
			try {
				properties.load(reader);
				reader.close();
			} catch (IOException e) {
					e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("Configuration.properties was not found in " + propertyFilePath);
		} 
	}
	
	public String getConfig(String Key){
		String path = properties.getProperty(Key);
		if(path!= null) 
			return path;
		else 
			throw new RuntimeException(Key + " not specified in the Configuration.properties file."); 
	}
 
}
