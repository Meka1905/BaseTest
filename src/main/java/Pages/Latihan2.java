package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Latihan2 {
    WebDriverWait wait;
    WebDriver driver;
    public Latihan2 (WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);

    }

    public void clickAdd(){
        By clickAdd = By.xpath(("//button[@id='addNewRecordButton']"));
        wait.until(ExpectedConditions.elementToBeClickable(clickAdd)).click();
//        JavascriptExecutor executor = (JavascriptExecutor)driver;
//        executor.executeScript("document.body.style.zoom = '0.5'");
    }

    public void formInputName(String firstName, String lastName){
        By inputfName = By.xpath("//input[@id='firstName']");
        wait.until(ExpectedConditions.elementToBeClickable(inputfName)).sendKeys(firstName);

        By inputlName = By.xpath("//input[@id='lastName']");
        wait.until(ExpectedConditions.elementToBeClickable(inputlName)).sendKeys(lastName);
    }

    public void formInputEmail(String email){
        By inputEmail = By.xpath("//input[@id='userEmail']");
        wait.until(ExpectedConditions.elementToBeClickable(inputEmail)).sendKeys(email);
    }

    public void formInputAge(String age){
        By inputAge = By.xpath("//input[@id='age']");
        wait.until(ExpectedConditions.elementToBeClickable(inputAge)).sendKeys(age);
    }

    public void formInputSalary(String salary){
        By inputSalary = By.xpath("//input[@id='salary']");
        wait.until(ExpectedConditions.elementToBeClickable(inputSalary)).sendKeys(salary);
    }
    public void formInputDepartment(String department){
        By inputDepart = By.xpath("//input[@id='department']");
        wait.until(ExpectedConditions.elementToBeClickable(inputDepart)).sendKeys(department);
    }
    public void clickSubmit(){
        By clickSubmit = By.xpath(("//button[@id='submit']"));
        wait.until(ExpectedConditions.elementToBeClickable(clickSubmit)).click();
    }


}
