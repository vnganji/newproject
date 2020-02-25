package resources;

import org.openqa.selenium.WebDriver;

public class DriverManager {
	
	public static ThreadLocal<WebDriver> dr = new ThreadLocal<WebDriver>();
	
	public static void setDriver(WebDriver driver){
		dr.set(driver);
	}
	
	public static WebDriver getDriver(){
		return dr.get();
	}

}
