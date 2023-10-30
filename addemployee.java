package seleium_java;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class addemployee { 
	public static void main(String args[]) throws Exception {
		System.setProperty("Webdriver.chrome.driver", "\\Users\\Abhishek\\Downloads\\chromedriver_win32.zip");
		WebDriver driver= new ChromeDriver();
		driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys("ädmin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(5000);
		driver.switchTo().frame("rightMenu");
		driver.findElement(By.xpath("//*[@id='standardView']/div[3]/div[1]/input[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("txtEmpLastName")).sendKeys("abhi");
		Thread.sleep(3000);
		driver.findElement(By.name("txtEmpFirstName")).sendKeys("amin");
		driver.findElement(By.xpath("//*[@id='btnEdit']")).click();
		Thread.sleep(3000);
		System.out.println("employee added");
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Logout")).click();
		
		driver.quit();
		

				
		

				
	}

}
