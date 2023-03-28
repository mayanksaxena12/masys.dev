package masys.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import POM.TherapistSignUpPage;

public class BaseClass {
	
	public WebDriver driver;
	public ChromeOptions co= new ChromeOptions();
	
	@BeforeSuite
	public void bsConfig() {
		System.out.println("The DataBase connection is established.");
		
	}
	
	@BeforeClass
	public void bcConfig() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions ab = co.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(ab);
		driver.manage().window().maximize();
		driver.get("https://masys.dev/");
		System.out.println("The URL has been navigated");
	}
	
	/*@BeforeMethod
	public void bmConfig() {
		
		
		
		
	}
	
	@AfterMethod
	public void amConfig() {
		System.out.println("Sucessfully create account.");
		
	}*/
	
	@AfterClass
	public void acConfig() throws InterruptedException {
		Thread.sleep(10000);
		driver.quit();
		System.out.println("The Browser is closed");
	}
	
	@AfterSuite
	public void asConfig() {
		System.out.println("The database connection is disconnected!");
	}

}
