package Android;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.URL;
import io.appium.java_client.AppiumDriver;

public class Calculator {
	
	static AppiumDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
		openCalculator();
		}
		catch(Exception exp){
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
			exp.getStackTrace();
		}
	}
		
		public static <MobileElement> void openCalculator() throws Exception {
			
			DesiredCapabilities cap = new DesiredCapabilities();
			cap.setCapability("devicename", "motorola edge 20 fusion");
			cap.setCapability("UDID", "ZD22232MPV");
			cap.setCapability("platformName", "Android");
			cap.setCapability("platformVersion", "12");
			
			cap.setCapability("appPackage", "com.google.android.calculator");
			cap.setCapability("appActivity", "com.android.calculator2.Calculator");
			
			URL url = new URL("http://127.0.0.1:4723/wd/hub");
			driver = new AppiumDriver(url,cap);
			System.out.println("application started");
			
			driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"6\"]")).click();
			System.out.println("six");
			driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"plus\"]")).click();
			System.out.println("+");
			driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"7\"]")).click();
			System.out.println("7");
			driver.findElement(By.id("com.google.android.calculator:id/eq")).click();
			System.out.println("=");
			String result = driver.findElement(By.className("android.widget.TextView")).getText();
			System.out.println("Sum is: "+result);
		}


}
