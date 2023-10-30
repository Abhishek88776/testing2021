package seleium_java;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MOUSEHOVER {
	public static void main(String args[])throws Exception {
		System.setProperty("Webdriver.chromedriver", "\\Users\\Abhishek\\Downloads\\chromedriver_win32.zip");
		WebDriver driver=new ChromeDriver();
		driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(4000);
	
		WebElement element=driver.findElement(By.linkText("PIM"));
		Actions action=new Actions(driver);
		action.moveToElement(element).build().perform();
		Thread.sleep(4000);
		driver.findElement(By.linkText("Add Employee")).click();
		Thread.sleep(5000);
		driver.close();
		
		
	}

}
