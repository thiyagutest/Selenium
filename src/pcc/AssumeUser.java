package pcc;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssumeUser {
	public static void main(String s[])
	{
		System.setProperty("webdriver.chrome.driver", "D:/SeleniumDrivers/chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\velavan.sekar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://pcc.wavespot.net:8080/users/sign_in");
		
		WebElement username = driver.findElement(By.xpath("//*[@id='user_email']"));
		username.sendKeys("thiyagarajan@prontonetworks.net");
		WebElement pass = driver.findElement(By.xpath("//*[@id='user_password']"));
		pass.sendKeys("12345678");
		
		WebElement login = driver.findElement(By.xpath("//*[@id='new_user']/div[5]/input"));
		login.click();
		
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WebElement assume=driver.findElement(By.linkText("Assume User"));
		assume.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WebElement mytable = driver.findElement(By.xpath("//*[@id=\"assume-user-page\"]/div/div/div/div/div/div[2]/table"));
		List<WebElement> rows=mytable.findElements(By.tagName("tr"));
		System.out.println(rows.size());
		for(int i=1;i<rows.size();i++)
		{
			List<WebElement> vals=rows.get(i).findElements(By.tagName("td"));
			List<WebElement> links=rows.get(i).findElements(By.linkText("Assume"));
			for(int n=1;n<vals.size();n++)
			{
		if(vals.get(n).getText().contains("test@mailinator.com"))
		{
		System.out.println("we are there to click...");
		links.get(0).click();//clicking Assume
		}
			}
	}
	}
}