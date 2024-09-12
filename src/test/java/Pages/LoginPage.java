package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    WebDriver driver;

    By emaillocator = By.name("email");
    By passlocator  = By.name("password");
    By loginlocator = By.xpath("//button[text()='Login']");
    By logoutlocator = By.xpath("//a[@href='/logout']");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void emailtextField(String email){
        WebElement emailField = driver.findElement(emaillocator);
        emailField.sendKeys(email);
    }
    public void passtextField(String password){
        WebElement passField = driver.findElement(passlocator);
        passField.sendKeys(password);
    }
    public void loginbtnField(){
        WebElement loginField = driver.findElement(loginlocator);
        loginField.click();
    }

    public boolean logoutbtnField(){
        return driver.findElement(logoutlocator).isDisplayed();
    }


}
