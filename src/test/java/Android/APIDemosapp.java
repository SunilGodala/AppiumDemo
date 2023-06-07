package Android;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;

public class APIDemosapp {
	 
	static AppiumDriver driver;

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("devicename", "motorola edge 20 fusion");
		cap.setCapability("UDID", "ZD22232MPV");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "12");
		
		cap.setCapability("appPackage", "io.appium.android.apis");
		cap.setCapability("appActivity", "io.appium.android.apis.ApiDemos");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AppiumDriver(url,cap);
		System.out.println("application started");
		
		driver.findElement(By.id("com.android.permissioncontroller:id/continue_button")).click();
		//driver.findElement(By.id("android:id/button1")).click();
		driver.switchTo().alert().accept();
		//driver.findElement(By.xpath("//android.widget.TextView[@index='2']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@index='10']")).click();
		
		
		AndroidTouchAction touch = new AndroidTouchAction((PerformsTouchActions) driver);
		touch.tap(TapOptions.tapOptions().withElement(ElementOption.element(driver.findElement(By.xpath("//android.widget.TextView[@index='10']"))))).perform();

	}

}
