package com.mystore.Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
	
	Properties prop;
	
	String path="C:\\Users\\DELL\\eclipse-workspace\\com.mynewStore\\Configuration\\config.properties";

	//construter
	public ReadConfig() {
		prop= new Properties();
		try {
			FileInputStream file= new FileInputStream(path);
			prop.load(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public String getBaseUrl() {
		String value = prop.getProperty("baseUrl");
		if(value!=null) 
			return value;
			else
				throw new RuntimeException("url is not specified in config file");
		}

	
	public String getbrowser() {
		
		String value = prop.getProperty("browser");
		if(value!=null) 
			return value;
		else
			throw new RuntimeException("browser is not specified in config file");
			
	}
	
	
	
	
	
	
		
		
		
	}
	
	
	
	
	
	
	
	

