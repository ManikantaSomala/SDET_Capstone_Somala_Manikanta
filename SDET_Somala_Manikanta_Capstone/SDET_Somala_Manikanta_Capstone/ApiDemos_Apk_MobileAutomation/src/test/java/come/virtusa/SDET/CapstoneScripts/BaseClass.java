package come.virtusa.SDET.CapstoneScripts;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import io.appium.java_client.android.AndroidDriver;

public class BaseClass {
	public AndroidDriver driver;
	@BeforeTest
	public void setup() throws MalformedURLException, InterruptedException {
		DesiredCapabilities caps=new DesiredCapabilities();
		caps.setCapability("platformName", "Android");
		caps.setCapability("deviceName", "Pixel 3a");
		caps.setCapability("app", "C:\\Users\\MANIKANTASOMALA\\New WorkSpace\\ApiDemos_Apk_MobileAutomation\\resources\\ApiDemos-debug.apk");
		caps.setCapability("automationName", "UiAutomator2");
		driver=new AndroidDriver(new URL("http://127.0.0.1:4723"),caps);
		Thread.sleep(4000);		
	}

}
