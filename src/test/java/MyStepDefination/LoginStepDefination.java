package MyStepDefination;

import Pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;


public class LoginStepDefination {


    WebDriver driver  = Hooks.driver;
    LoginPage loginpage;

    @Given("user is on application login page")
    public void user_is_on_application_login_page() throws Exception{
        driver.get("https://www.automationexercise.com/login");
       loginpage = new LoginPage(driver);
    }

    @Given("i have provided the valid username and password")
    public void i_have_provided_the_valid_username_and_password() throws Exception{
        loginpage.emailtextField("amitpatnaik008@gmail.com");
        loginpage.passtextField("Test@1234");
    }
    @When("i have click on login button")
    public void i_have_click_on_login_button() throws Exception{
        loginpage.loginbtnField();
    }
    @Then("i should successfully login to application")
    public void i_should_successfully_login_to_application() throws Exception{
        Assert.assertEquals(loginpage.logoutbtnField(), true);
    }
}
