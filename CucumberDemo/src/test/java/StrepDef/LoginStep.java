package StrepDef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class LoginStep {
    WebDriver driver;

    @Given("I am in the Login Page")
    public void i_am_in_the_swag_labs_login_page() {
      driver = new ChromeDriver();
        	driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       	 driver.get("https://www.saucedemo.com/");
    }
  @When("user provides a valid user id")
    public void user_provides_a_valid_user_id() {
          driver.findElement(By.name("user-name")).sendKeys("standard_user");
    }
      @When("user provides a valid password")
       public void user_provides_a_valid_password() {
         driver.findElement(By.name("password")).sendKeys("secret_sauce");
    }
 @When("user provides an invalid user id")
    public void user_provides_an_invalid_user_id() {
        driver.findElement(By.name("user-name")).sendKeys("hari");
    }
  @When("user provides an invalid password")
    public void user_provides_an_invalid_password() {
      driver.findElement(By.name("password")).sendKeys("1203Hari*");
    }
  @When("user provides an invalid user id as blank space")
  public void user_provides_an_invalid_user_id_as_blank_space() {
	  driver.findElement(By.name("user-name")).sendKeys("");
  }

  @When("user provides an invalid password as blank space")
  public void user_provides_an_invalid_password_as_blank_space() {
	  driver.findElement(By.name("password")).sendKeys("");
  }
@When("user clicks the login button")
    public void user_clicks_the_login_button() {
             driver.findElement(By.id("login-button")).click();
    }
 @Then("I should see the homepage")
    public void i_should_see_the_homepage() {
        WebElement page = driver.findElement(By.className("inventory_container"));
        Assert.assertTrue(page.isDisplayed(), "User is not on the homepage");
        driver.quit();
    }
@Then("I should see the error message")
    public void i_should_see_the_error_message() {
        WebElement error = driver.findElement(By.xpath("//h3[@data-test='error']"));
        Assert.assertTrue(error.isDisplayed(), "Error message not displayed");
        driver.quit();
    }
}