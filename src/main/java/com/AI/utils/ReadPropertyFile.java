/**
 * 
 */
package com.AI.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;

import com.AI.constants.FrameworkConstants;

/**
 * @author kranthi
 *
 */
public final class ReadPropertyFile {


	private ReadPropertyFile() {

	}
	//once we apply null check condition to the value of get property key , the IO exception will be changed to "Exception" due to implementation of new method.
	//public static String getValue(String key) throws IOException 






	/**
	 *   
	 *   // LAZY Initialization , we are waiting for all the feilds are executed . if there are 1000 values in property file then it is hard to wait.
	 *   
	 *   public static String getValue(String key) throws Exception  {
    	String value = "";

    	// properties is a class importing from testng
	Properties property = new Properties();
    	FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+ "/src/test/resources/config/config.properties" );

    	property.load(fis);
    	value = property.getProperty(key);
    	if(Objects.isNull(value)) {
    		throw new Exception ("Property name "+ key + "is not found . please check config properties");
    	}
    	return property.getProperty(key);   //return the string value to the  property file from config property 
}
	 * @param key
	 * @return
	 * @throws Exception
	 */
	private static Properties property = new Properties();
	
	
	// IF MORE NUMBER OF RETRIEVAL OPERATIONS ARE THERE ITS GOOD TO GO WITH THE BELOW APPROACH OR ELSE USE THE ABOVE COMMENTED CODE.
	
	private static final Map<String , String> CONFIGMAP = new HashMap<>();
	
	static {

		try {
			
			// changing the hardcoded value
			// FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+ "/src/test/resources/config/config.properties" );

			
			
			FileInputStream fis = new FileInputStream(FrameworkConstants.getConfigfilepath() );
			property.load(fis);
			
			// step 1 : for (String key : property.keySet())  error , it is returning object but not string 
				// step 2 : for (String key : property.keySet()) , now change to string to object 
			//for (Object key : property.keySet()) {   // WE CAN convert the for  loop to entry set instead of key set as suggested by sonalint
			// CONFIGMAP.put(key, property.getProperty(key));  This line of code is returning object value but our map is returning string 
		/*	for (Object key : property.keySet()) {
			CONFIGMAP.put(String.valueOf(key) , String.valueOf(property.get(key)));  // converting the key object to string value .
		*/	
			
			for (Map.Entry<Object, Object> entry : property.entrySet()) {
				CONFIGMAP.put(String.valueOf(entry.getKey()), String.valueOf(entry.getValue()));
				
			} 
			//property.entrySet().forEach(entry->CONFIGMAP.put(String.valueOf(entry.getKey()), String.valueOf(entry.getValue())));
		} 


		catch(FileNotFoundException e){

			e.printStackTrace();

		}

		catch(IOException e){

			e.printStackTrace();

		}

	}
	
	public static  String get(String key) throws Exception {
		if (Objects.isNull(key) || Objects.isNull(CONFIGMAP.get(key).toLowerCase()))  // adding lowercase for ENUM 
		{
		
		throw new Exception ("Property name "+ key + "is not found . please check config properties");}
		return CONFIGMAP.get(key);}

	
	}
	

	