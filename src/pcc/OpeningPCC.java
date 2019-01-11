package pcc;

import javax.management.loading.PrivateClassLoader;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpeningPCC {
	public void opening() throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\SeleniumDrivers\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("http://pcc.wavespot.net:8080/users/sign_in");
		Thread.sleep(5000);
		d.manage().window().maximize();
		WebElement name = d.findElement(By.id("user_email"));
		name.sendKeys("thiyagarajan@prontonetworks.net");
		WebElement pass = d.findElement(By.id("user_password"));
		pass.sendKeys("12345678");
		WebElement cli = d.findElement(By.name("commit"));
		cli.click();
		Thread.sleep(3000);
}
}