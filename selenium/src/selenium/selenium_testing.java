package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium_testing {
	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C://selenium//chromedriver.exe");
		WebDriver wb= new ChromeDriver();
		
		//login
		
		wb.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/auth/login"); //opeans the url
		wb.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");  // gives the username
		wb.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");  // gives the password
		wb.findElement(By.xpath("//*[@id='btnLogin']")).click();   // click on the login button
		wb.findElement(By.xpath("//*[@id='welcome']")).click();    // click on the welcome paul 
		Thread.sleep(2000);         // sleep time duration
		
		//about section
		
		wb.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[1]/a")).click();
		Thread.sleep(2000);
		wb.findElement(By.xpath("//*[@id='displayAbout']/div/a")).click();
		
		//support section
		
		Thread.sleep(2000);
		wb.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[2]/a")).click();
		Thread.sleep(2000);
		wb.findElement(By.xpath("//*[@id='menu_admin_viewAdminModule']/b")).click();
		Thread.sleep(2000);
		
		//adding a user
		
		wb.findElement(By.xpath("//*[@id='btnAdd']")).click();
		Thread.sleep(2000);
		wb.findElement(By.xpath("//*[@id='systemUser_employeeName_empName']")).sendKeys("Admin A");
		Thread.sleep(2000);
		wb.findElement(By.xpath("//*[@id='UserHeading']")).click();
		Thread.sleep(2000);
		wb.findElement(By.xpath("//*[@id='systemUser_userName']")).sendKeys("sushanta nandy12");
		Thread.sleep(2000);
		wb.findElement(By.xpath("//*[@id='systemUser_password']")).sendKeys("AlokPandey@123");
		Thread.sleep(2000);
		wb.findElement(By.xpath("//*[@id='systemUser_confirmPassword']")).sendKeys("AlokPandey@123");
		Thread.sleep(2000);
		wb.findElement(By.xpath("//*[@id='btnSave']")).click();
		
		//deleating a user
		
		wb.findElement(By.xpath("//*[@id='searchSystemUser_userName']")).sendKeys("sushanta nandy12");
		Thread.sleep(2000);
		wb.findElement(By.xpath("//*[@id='searchBtn']")).click();
		Thread.sleep(2000);
		wb.findElement(By.xpath("//*[@id='ohrmList_chkSelectRecord_68']")).click();
		Thread.sleep(2000);
		wb.findElement(By.xpath("//*[@id='btnDelete']")).click();
		Thread.sleep(2000);
		wb.findElement(By.xpath("//*[@id='dialogDeleteBtn']")).click();
		
		//logout
		Thread.sleep(2000);
		wb.findElement(By.xpath("//*[@id='welcome']")).click();
		wb.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[3]/a")).click();  // click on logout
		Thread.sleep(3000);
		wb.close();
	}

}