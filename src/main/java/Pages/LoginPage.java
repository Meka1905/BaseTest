package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    WebDriverWait wait;
    WebDriver driver;

    public LoginPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
    }

    public void loginHrm(String uName,String pass){
        By inputUsername = By.xpath("//input[@placeholder='Username']");
        wait.until(ExpectedConditions.elementToBeClickable(inputUsername)).sendKeys(uName);
        //this.driver.findElement(inputUsername).sendKeys(uName);
        By inputPassword = By.xpath("//input[@placeholder='Password']");
        wait.until(ExpectedConditions.elementToBeClickable(inputPassword)).sendKeys(pass);
        By buttonLogin = By.xpath(("//button[normalize-space()='Login']"));
        wait.until(ExpectedConditions.elementToBeClickable(buttonLogin)).click();

    }

    public void inputPassword(String pass){
        By inputUsername = By.xpath("");
    }

}
