package pcc;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import pcc.OpeningPCC;

public class SelectNetworkFromConfiguration  {
	
		public static void main(String[] args) throws InterruptedException {
		OpeningPCC o = new OpeningPCC();
		o.opening();
		WebDriver d = new ChromeDriver();
		Select s = new Select(d.findElement(By.id("Select_Network")));
		s.selectByVisibleText("v");
		Thread.sleep(2000);
		//Configuration
		d.findElement(By.xpath("//*[@id='menu']/ul/li[2]/a/span")).click();
		Thread.sleep(3000);
		//Network
		d.findElement(By.xpath("//*[@id='menu']/ul/li[2]/ul/li[1]/a/span")).click();
		Thread.sleep(3000);
		//Click Add SSID
		d.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[1]/div/div/div[1]/h3/a")).click();
		Thread.sleep(3000);
		//SSID name
		d.findElement(By.id("network_ssid_ssid_name")).sendKeys("Thiyagu123");
				
		//Slider window
		 WebElement slider = d.findElement(By.xpath("//*[@id='new_network_ssid']/div[2]/div/div/div[2]/div[1]/div/div[9]/div/div/div/div/div[1]/div[2]"));
		 Actions move = new Actions(d);
	     Action action = (Action) move.dragAndDropBy(slider, 100, 10).build();
	     action.perform();
	     //Scroll to bottom
	     JavascriptExecutor js = (JavascriptExecutor) d;
	     js.executeScript("window.scrollTo(50, document.body.scrollHeight)");
	     Thread.sleep(10000);
	     //Click on submit button
	     d.findElement(By.xpath("//*[@id='new_network_ssid']/div[2]/div/div/div[6]/div/div/div/button")).click();
	     //Get Alert message
		 String text = d.switchTo().alert().getText();
		System.out.println(text);
		
		
		}

}
