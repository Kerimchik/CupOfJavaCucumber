package pages.paylocitypage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }


    @FindBy(xpath = "//input[@name='form-username']")
    WebElement userName;


    @FindBy(xpath = "//input[@name='form-password']")
    WebElement password;



    @FindBy(xpath = "//button[@id='btnLogin']")
    WebElement loginBtn;


    @FindBy(id = "btnAddEmployee")
    WebElement addEmployeeButton;




    public void login(String username, String password){
        this.userName.sendKeys(username);
        this.password.sendKeys(password);
        this.loginBtn.click();
    }


    public void addNewEmployee(){
        addEmployeeButton.click();
    }



}
