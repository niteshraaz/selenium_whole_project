package hybrid;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

import java.net.MalformedURLException;
import java.util.Set;

import org.aspectj.lang.annotation.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class demo1 extends hybrid{
	
	@Test(enabled=true)
	public void testcase1() throws InterruptedException, MalformedURLException {
		AndroidDriver<AndroidElement> driver = capability();
		Thread.sleep(3000);
	//	driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry")).click();
		//driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"India\"))").click();
		
		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Sushanta Bhi");
		Thread.sleep(3000);
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		Thread.sleep(3000);
		//driver.pressKey(new KeyEvent(AndroidKey.HOME));
		driver.findElement(By.xpath("//*[@text='ADD TO CART']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@text='ADD TO CART']")).click();
		//driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"com.androidsample.generalstore:id/rvProductList\")).scrollIntoView(new Uiselector().textMatches(\"PG 3\"))"));
		//driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"com.androidsample.generalstore:id/rvProductList\")).scrollIntoView(new UiSelector().textMatches(\"PG 3\"))"));
		driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
		Thread.sleep(3000);
	String amnt1=	driver.findElements(By.id("com.androidsample.generalstore:id/productPrice")).get(0).getText();
	System.out.println(amnt1);
	amnt1=amnt1.substring(1);	
	Double famnt1=Double.parseDouble(amnt1);
	System.out.println(famnt1);
	Thread.sleep(3000);
	String amnt2=	driver.findElements(By.id("com.androidsample.generalstore:id/productPrice")).get(1).getText();
	amnt2=	amnt2.substring(1);	
	Double famnt2=Double.parseDouble(amnt2);
	Double Total=famnt1 + famnt2;
	System.out.println(Total);
String actual=	driver.findElement(By.id("com.androidsample.generalstore:id/totalAmountLbl")).getText();
//	Assert.assertEquals(actual, Total);
WebElement el=	driver.findElement(By.id("com.androidsample.generalstore:id/termsButton"));
		TouchAction tp= new TouchAction(driver);
		
		tp.longPress(longPressOptions().withElement(element(el)).withDuration(ofSeconds(3))).release().perform();
		
		driver.findElement(By.id("android:id/button1")).click();
		driver.findElement(By.className("android.widget.CheckBox")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/btnProceed")).click();
		Thread.sleep(9000);
		Set<String> contextNames = driver.getContextHandles();
		for (String contextName : contextNames) {
		    System.out.println(contextName); //prints out something like NATIVE_APP \n WEBVIEW_1
		}
		driver.context("WEBVIEW_com.androidsample.generalstore");
		driver.findElement(By.xpath("//*[@name='q']")).sendKeys("moolya");
		//driver.getKeyboard().pressKey(Keys.ENTER);       // alternative way
		Actions act=new Actions(driver);
		act.sendKeys(Keys.ENTER).build().perform();
		//act.sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(3000);
WebElement	element=	driver.findElement(By.xpath("//*[contains(text(),'Moolya | LinkedIn')]"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.getElementsByClassName('cz3goc BmP5tf')[1].scrollIntoView()");
	//	js.executeScript("arguments[0].scrollIntoView()",element);	
	Thread.sleep(3000);
	element.click();
		//driver.findElement(By.xpath("//*[contains(text(),'Moolya | LinkedIn')]")).click();
	//	Thread.sleep(3000);

}
	@Test(enabled=false)
	public void testcase2() throws InterruptedException, MalformedURLException {
		AndroidDriver<AndroidElement> driver = capability();
		Thread.sleep(3000);
		driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry")).click();
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"India\"))").click();
		Thread.sleep(3000);
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		Thread.sleep(3000);
		String	str=	driver.findElement(By.xpath("//android.widget.Toast")).getText();
		System.out.println(str);
		
	}
	}


