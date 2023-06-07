package Android;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class TestDemo {
	
	static AndroidDriver dr;

	public static <MobileElement> void main(String[] args) {
		// TODO Auto-generated method stu.
		
		DesiredCapabilities capability = new DesiredCapabilities();
		capability.setCapability(MobileCapabilityType.PLATFORM_NAME,MobilePlatform.ANDROID);
		capability.setCapability(MobileCapabilityType.DEVICE_NAME, "ZD22232MPV");
		capability.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		capability.setCapability("chromeoptions", ImmutableMap.of("w3c",false));
		
		//AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wb/hub"),cap); 
		
		dr = new URL("http://127.0.0.1:4723/wb/hub",capabiliy);
	}

}
