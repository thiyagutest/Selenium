package new_wavespot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DashboardCreation {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","D://SeleniumDrivers//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://platform.wavespot.net/ws/login.html");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/div/div[3]/div[1]/div/input"));
		username.sendKeys("network");
		WebElement passsword = driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/div/div[3]/div[2]/div/input"));
		passsword.sendKeys("Network@123");
		WebElement signin = driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/div/div[4]/button"));
		signin.click();
		
		//Click Dashboard
//		WebElement dashboard = driver.findElement(By.cssSelector(".caret"));
		WebElement dashboard = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[3]/ul/li[2]/a/p/Analytics"));
		dashboard.click();
		
		//Click session Dashboard
		WebElement session = driver.findElement(By.xpath("//*[@id='multi-dashboard']"));
		session.click();
		
		//Click + button to create new dashboard
		WebElement add = driver.findElement(By.xpath("//*[@id='multi-dashboard']/ul/li[1]/a"));
		add.click();
		
		//Add title to dashboard
		WebElement title = driver.findElement(By.xpath("//*[@id='dashboardTitle']"));
		title.clear();
		title.sendKeys("Testing1");
		
		//select structure to dashboard
		WebElement structure = driver.findElement(By.xpath("/html/body/div[6]/div/div/div[2]/form/div[3]/div/div[1]/div[1]/div/div/div/div/div[2]"));
		structure.click();
		
		//select structure to dashboard
		WebElement okbutton = driver.findElement(By.xpath("/html/body/div[6]/div/div/div[3]/button"));
		okbutton.click();
		
		Thread.sleep(20000);
		//logout
		WebElement logout = driver.findElement(By.xpath("/html/body/div[1]/div[2]/nav/div/div[3]/ul/li[2]/a/i"));
		logout.click();
	}

}
