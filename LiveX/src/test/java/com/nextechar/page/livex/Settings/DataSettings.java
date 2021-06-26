package com.nextechar.page.livex.Settings;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class DataSettings {
	
	public static String getURL() throws IOException
	{
		String URL="";
		try {
			FileReader reader=new FileReader("ApplicationRegistry.properties");
			Properties p=new Properties();  
			p.load(reader); 
			  URL= p.getProperty("URL");
				
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		
		return URL;
	}

}
