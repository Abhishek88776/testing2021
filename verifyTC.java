package seleium_java;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class verifyTC {
	public static void main(String args[]) {
		System.setProperty("Webdriver.chrome.driver", "\\Users\\Abhishek\\Downloads\\chromedriver_win32.zip");
		WebDriver driver=new ChromeDriver(); 
		driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
		if(driver.getTitle().equals("OrangeHRM - New Level of HR Management"))
		{
			System.out.println("tille is matched");
		}
			else
			{
				System.out.println("tille is not matched");
		}
		
		}
		
	}


