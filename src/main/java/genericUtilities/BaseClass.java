package genericUtilities;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import objetRepo.LoginPage;

public class BaseClass {
	public WebDriver driver;
	
	PropertyFileUtilities putil= new PropertyFileUtilities();
	SeleniumUtilities sutil= new SeleniumUtilities();
	

	
	@BeforeSuite
	public void bsConfig()
	{
		System.out.println("---------------DataBase Connection Successful-----------------");
	}
	
	@BeforeTest
	public void btConfig() throws IOException
	{
		String URL = putil.propertyFiles("URL");
		driver= new ChromeDriver();
		driver.get(URL);
		driver.manage().window().maximize();
		sutil.implicitWaits(driver, 10);
		System.out.println("-----------------Browser Launched--------------------");
	}
	
    @BeforeMethod
    public void bcConfig() throws IOException
    {
    String USERNAME = putil.propertyFiles("USERNAME");
    String PASSWORD = putil.propertyFiles("PASSWORD");
    LoginPage lp= new LoginPage(driver);
    lp.loginToapplication(USERNAME, PASSWORD);
    System.out.println("-------------------login successful----------------------");
    }
    
    @AfterMethod
    public void amConfig() throws InterruptedException
    {
    	driver.findElement(By.xpath("//img[@src=\"themes/softed/images/user.PNG\"]")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
    	System.out.println("---------------------Logout Successfull-----------------------");
    }
    
    @AfterTest
    public void atConfig()
    {
    	driver.quit();
    	System.out.println("-----------------browser closed-----------------------");
    }
    @AfterSuite
    public void asConfig()
    {
    	System.out.println("---------------------database connection closed-----------------------");
    }
}
