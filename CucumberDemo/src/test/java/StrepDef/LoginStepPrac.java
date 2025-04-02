package StrepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeOptions;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class LoginStepPrac {
    WebDriver driver;

    @Before("@ChromeBrowser")
    public void setUpChrome() {
        driver = new ChromeDriver();
    }

    @Before("@FireFoxBrowser")
    public void setUpFirefox() {
        driver = new FirefoxDriver();
    }

    

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Given("the user in on Login page")
    public void the_user_is_on_login_page() {
        driver.get("https://www.saucedemo.com/");
    }

    @When("the user provides the valid username")
    public void the_user_provides_the_valid_username() {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
    }

    @When("the user provides the valid password")
    public void the_user_provides_the_valid_password() {
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
    }

    @When("the user provides the blank username")
    public void the_user_provides_the_blank_username() {
        driver.findElement(By.id("user-name")).sendKeys("");
    }

    @When("the user provides the blank password")
    public void the_user_provides_the_blank_password() {
        driver.findElement(By.id("password")).sendKeys("");
    }

    @When("the user provides the invalid username")
    public void the_user_provides_the_invalid_username() {
        driver.findElement(By.id("user-name")).sendKeys("invalid_user");
    }

    @When("the user provides the invalid password")
    public void the_user_provides_the_invalid_password() {
        driver.findElement(By.id("password")).sendKeys("wrong_password");
    }

    @When("the user clicks the login button")
    public void the_user_clicks_the_login_button() {
        driver.findElement(By.id("login-button")).click();
    }

    @Then("the user is able to visible the ProductText in the same page")
    public void the_user_is_able_to_visible_the_product_text_in_the_same_page() {
        WebElement productText = driver.findElement(By.className("title"));
        assert productText.isDisplayed();
    }

    @Then("the user is able to visible the error message")
    public void the_user_is_able_to_visible_the_error_message() {
        WebElement errorMsg = driver.findElement(By.cssSelector("h3[data-test='error']"));
        assert errorMsg.isDisplayed();
    }
}
