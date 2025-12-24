package com.ninzacrm.genericutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {
	
	public String toGetDataFromProperties(String key) throws IOException {
		
		FileInputStream fis = new FileInputStream("./src/main/resources/ninzacrm.properties");
		Properties pObj=new Properties();
		pObj.load(fis);
		
		String Value = pObj.getProperty(key);
		
		return Value;
	}

	

}
