package Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
	
	WebDriver driver;
	
@Given("the user opens demoguru site")
public void openSite() {
    
	driver=new ChromeDriver();
	
	driver.get("https://demo.guru99.com/test/newtours/index.php");
}	

@When("the user enter the login creds \\({string}, {string})")
public void enterCreds(String username, String pwd) {
    
	driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("admin");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin");
}

@And("the user clicks on the Submit button")
	
	public void clickSubmit() {
	
	driver.findElement(By.xpath("//input[@name='submit']")).click();
	
   
}

@Then("the user should see the Login Successful message")
	
	public void msg() {
	
	WebElement msg= driver.findElement(By.xpath("//*[text()='Login Successfully']"));
	
	System.out.println(msg.getText());
	System.out.println(driver.getTitle());
	driver.quit();
}

}
