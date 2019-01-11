package new_wavespot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Alert {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D://SeleniumDrivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://pcc.wavespot.net:8080/users/sign_in");
		
		WebElement username = driver.findElement(By.xpath("//*[@id='user_email']"));
		username.sendKeys("thiyagarajan@prontonetworks.net");
		WebElement pass = driver.findElement(By.xpath("//*[@id='user_password']"));
		pass.sendKeys("12345678");
		
		WebElement login = driver.findElement(By.xpath("//*[@id='new_user']/div[5]/input"));
		login.click();
		
		//Click on network name class
		Select drop = new Select(driver.findElement(By.name("Select Network")));
		drop.selectByVisibleText("class");
		
		//Click on Configuration
		WebElement configuration = driver.findElement(By.xpath("//*[@id='menu']/ul/li[2]/a/span"));
		configuration.click();
		
		//Click on Network under configuration
		driver.findElement(By.xpath("//*[@id='menu']/ul/li[2]/ul/li[1]/a/span")).click();
		Thread.sleep(20000);
		//Click on Delete ssid
		driver.findElement(By.xpath("//*[@id='example']/tbody/tr[3]/td[9]/a[2]")).click();
		driver.switchTo().alert().accept();
		
		
		
	}

}
