package com.meet.the.family.support;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigFIle {
	
	public static Properties loadPropertyFile(String filePath) throws IOException {
		File file = new File(filePath);
		FileInputStream fileInputStream = new FileInputStream(file);
		java.util.Properties properties = new java.util.Properties();
		properties.load(fileInputStream);
		return properties;
		
		
	}
	
	

}
