package come.virtusa.SDET.CapstoneScripts;
import org.testng.Assert;
import org.testng.annotations.Test;
 
import io.appium.java_client.AppiumBy;
 
public class WiFiCheck extends BaseClass{
	@Test
	public void setupWifi() throws InterruptedException {
		driver.findElement(AppiumBy.accessibilityId("Preference")).click();
		Thread.sleep(3000);
		driver.findElement(AppiumBy.accessibilityId("3. Preference dependencies")).click();
		Thread.sleep(3000);
		driver.findElement(AppiumBy.id("android:id/checkbox")).click();
		Thread.sleep(3000);
		driver.findElement(AppiumBy.xpath("(//android.widget.RelativeLayout)[2]")).click();
		Thread.sleep(3000);
//		String str=driver.findElement(AppiumBy.id("android:id/alerttitle")).getText();
//		System.out.println(str);		
		 driver.findElement(AppiumBy.id("android:id/edit")).sendKeys("manikanta");

		Thread.sleep(3000);
		driver.findElement(AppiumBy.id("android:id/button1")).click();

	}
 
}

