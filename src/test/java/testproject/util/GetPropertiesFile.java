package testproject.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class GetPropertiesFile {
	//Location of the properties file
	private static File propFile = new File("src//main//java//resources//testprojectProperties.properties");
	private static Properties props = null;

	/**
	 * Get a property from the xpages properties file
	 * @param prop - the name of the property to get
	 * @return propres - the value of the property
	 */
	public static String getProperty(String prop){
		String propRes = null;
		
		try{
			if(props == null) {
				props = load(propFile);
			}
			propRes = props.getProperty(prop);
		}catch(IOException ioe){
			ioe.printStackTrace();
		}
		return propRes;
	}
	
	/**
     * Load the Properties File
     * @param propsFile - the property file
     * @return props - the properties
     */
    public static Properties load(File propsFile) throws IOException {
        Properties props = new Properties();
        FileInputStream fis = new FileInputStream(propsFile);
        props.load(fis);    
        fis.close();
        return props;
    }
	
	

	
	

	
   
	
}


