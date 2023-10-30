package seleium_java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import org.openqa.selenium.chrome.ChromeDriver;

public class Launchbrowser  {

	public static void main(String[] args) throws Exception {
		System.setProperty("Webdriver.chrome.driver", "\"C:\\Users\\Abhishek\\Downloads\\chromedriver_win32\\chromedriver.exe\"");
 WebDriver driver = new ChromeDriver();
		driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys("ädmin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Logout")).click();
		driver.close();
		
		
	
		
		
		
		

		
	}

}
