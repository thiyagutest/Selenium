package new_wavespot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Create_Admin_User {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:/SeleniumDrivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://platform.wavespot.net/ws/login.html");
	driver.manage().window().maximize();
	WebElement username = driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/div/div[3]/div[1]/div/input"));
	username.sendKeys("network");
	WebElement passsword = driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/div/div[3]/div[2]/div/input"));
	passsword.sendKeys("Network@123");
	WebElement signin = driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/div/div[4]/button"));
	signin.click();
	
	//Click management
	WebElement management = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[3]/ul/li[8]/a"));
	management.click();
	
	//Click Admin Users
	WebElement Adminusers = driver.findElement(By.xpath("//*[@id='management']/ul/li[1]/a"));
	Adminusers.click();
}
}
