package cucumberTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class SeleniumTest {
	
	private static WebDriver driver = null;
	public static void main(String[] args) {
		
	
		driver = new FirefoxDriver();

        //Put a Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Launch the Online Store Website

        driver.get("http://www.store.demoqa.com");
	   

	

        // Find the element that's ID attribute is 'account'(My Account) 

        driver.findElement(By.xpath("//a[@href='http://store.demoqa.com/products-page/your-account/']")).click();
	    
	

	

        driver.findElement(By.id("log")).sendKeys("rajeshdotlucky"); 

       

        driver.findElement(By.id("pwd")).sendKeys("versumlat1234");

	   

	

        driver.findElement(By.id("login")).click();

        

        System.out.println("Login Successfully");
	    

	

        // Find the element that's ID attribute is 'account_logout' (Log Out)

        driver.findElement (By.xpath("//li//a[text()='Log out']")).click();

        // Print a Log In message to the screen

        System.out.println("LogOut Successfully");

	    

	

        driver.quit();
	    
	
	

        


        
        

        

	}
}
