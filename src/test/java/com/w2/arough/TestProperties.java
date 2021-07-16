package com.w2.arough;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestProperties {
	
	public static void main(String args[]) throws IOException
	{
		System.getProperty("user.dir");
		Properties config=new Properties();
		Properties OR=new Properties();
		FileInputStream fn=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\com\\w2a\\properties\\Config.properties");
	config.load(fn);	
	
	 fn=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\com\\w2a\\properties\\OR.properties");
	OR.load(fn);
	
	
	System.out.println(config.getProperty("browser"));;
	System.out.println(OR.getProperty("bankmanagerloginbtn"));;
	}

}
