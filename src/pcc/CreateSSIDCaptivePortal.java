package pcc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateSSIDCaptivePortal {

	public static void main(String[] args) throws InterruptedException {
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
		WebElement ssidname = d.findElement(By.id("network_ssid_ssid_name"));
		ssidname.clear();
		ssidname.sendKeys("Thiyagu-Test1");
		//selecting SSID status Enable
		d.findElement(By.id("network_ssid_is_enabled_true")).click();
		//Selecting SSID Hidden as Disable
		d.findElement(By.id("network_ssid_is_hidden_false")).click();
		//Selecting SSID Isolate as Disable
		d.findElement(By.id("network_ssid_is_isolate_false")).click();
		//Selecting Radio Band 5GHz
		d.findElement(By.id("network_ssid_radio_band_5")).click();
		//Selecting Apply SSID Qos enable
		d.findElement(By.id("network_ssid_enable_ssid_qos_true")).click();
		//Selecting Qos as custom
		d.findElement(By.id("custom_slider_check")).click();
		//Filling value
		d.findElement(By.id("slider_output")).sendKeys("250");
		//slider
		//Select Policies Disable
		Select s1 = new Select(d.findElement(By.id("network_ssid_acl_mac")));
		s1.selectByValue("0");
		Thread.sleep(2000);
		//Association WPA2-PSK
		d.findElement(By.id("network_ssid_security_mode_psk2")).click();
		//Select custom key
		d.findElement(By.id("network_ssid_psk_type_custom")).click();
		//Select Encryption algorithm TKIP
		Select algorithm = new Select(d.findElement(By.id("network_ssid_wpa_algorithm")));
		algorithm.selectByValue("TKIP");
		//Entering Authentication key
		d.findElement(By.id("network_ssid_wpa_key")).sendKeys("wavespot");
		Thread.sleep(2000);
		//Selecting SSID WDS Disable
		d.findElement(By.id("network_ssid_wds_enabled_false")).click();
		//Selecting Router Mode
		d.findElement(By.id("network_ssid_ssid_mode_1")).click();
		//Selecting NAT Enable
		d.findElement(By.id("network_ssid_nat_1")).click();
		//Selecting WAN Network Access Disable
		d.findElement(By.id("network_ssid_wna_1")).click();
		//Selecting Uplink Priority  Disable
		d.findElement(By.id("network_ssid_uplink_priority_1")).click();
		
		//Selecting IP configurations
		d.findElement(By.linkText("IP Configuration")).click();
		Thread.sleep(10000);
		//Entering IP Address
		WebElement ipaddress = d.findElement(By.id("network_ssid_ip_address"));
		ipaddress.clear();
		ipaddress.sendKeys("192.168.145.1");
		//Entering NetMask
		d.findElement(By.id("network_ssid_subnet_mask"));
		//Selecting DNS Mode
		Select dns = new Select(d.findElement(By.id("network_ssid_dns_mode")));
		dns.selectByValue("1");
		
		//Selecting DHCP settings
		d.findElement(By.linkText("DHCP Settings")).click();
		//Enable DHCP server
		Select dhcp = new Select(d.findElement(By.id("network_ssid_dhcp_relay_server")));
		dhcp.selectByValue("2");
		//Changing lease time
		WebElement lease = d.findElement(By.id("network_ssid_dhcp_lease_time"));
		lease.getText().toString();
		System.out.println(lease);
		
		
		//Click on plus
		
		d.findElement(By.xpath("//*[@id='headingOne']/h4/a[2]/i")).click();
		
		//DHCP Start
		WebElement start = d.findElement(By.id("network_ssid_dhcp_ranges__START"));
		start.clear();
		start.sendKeys("192.168.145.2");
		
		//DHCP End
		WebElement End = d.findElement(By.id("network_ssid_dhcp_ranges__END"));
		End.clear();
		End.sendKeys("192.168.145.100");
		
		//*[@id="headingOne"]/h4/a[2]/i
		//Selecting captive portal
		Select cp = new Select(d.findElement(By.id("network_ssid_captive_portal")));
		cp.selectByValue("1");
		//Selecting RADIUS Authentication
		Select auth = new Select(d.findElement(By.id("network_ssid_auth_radius_id")));
		auth.selectByVisibleText("Radius_auth");
		//Enabling Accounting
		Select Accounting = new Select(d.findElement(By.id("network_ssid_acc_radius_enabled")));
		Accounting.selectByValue("1");
		//Enable Mac Auth
		Select mac = new Select(d.findElement(By.id("network_ssid_mac_auth")));
		mac.selectByValue("1");
		//Selecting RADIUS Accounting
		Select acco = new Select(d.findElement(By.id("network_ssid_acc_radius_id")));
		acco.selectByVisibleText("Radius_accounting");
		//Selecting Interim update time
		WebElement interim = d.findElement(By.id("network_ssid_default_interim_time"));
		interim.clear();
		interim.sendKeys("600");
		//Selecting Interim update time
		WebElement idletimeout = d.findElement(By.id("network_ssid_default_idle_timeout"));
		idletimeout.clear();
		idletimeout.sendKeys("5000");
		//Splash URL
		WebElement splashurl = d.findElement(By.id("network_ssid_splash_url"));
		splashurl.clear();
		splashurl.sendKeys("http://www.thiyagu.com");
		//Selecting success URL
		d.findElement(By.id("network_ssid_success_url")).click();
		//SuccessURL
		WebElement successurl = d.findElement(By.id("network_ssid_success_url"));
		successurl.clear();
		successurl.sendKeys("http://www.thiyagu.com/success");
		//Selecting WalledGarden
		Select walledgarden = new Select(d.findElement(By.id("network_ssid_wallgarden")));
		walledgarden.selectByValue("1");
		//Selecting custom and Per User Qos
		d.findElement(By.id("custom_slider_check")).click();
		WebElement UserQos = d.findElement(By.id("slider_output"));
		UserQos.clear();
		UserQos.sendKeys("2056");
		d.findElement(By.xpath("//*[@id='new_network_ssid]/div[2]/div/div/div[6]/div/div/div/button")).click();
		
		
		
		//*[@id="custom_slider_check"]
		
		
		
		
		
	}
}
