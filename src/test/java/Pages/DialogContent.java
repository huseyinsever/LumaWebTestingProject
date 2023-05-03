package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;

public class DialogContent extends Parent{

    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy (xpath = "(//a[text()='Create an Account'])[1]")
    private WebElement createAccount;

    @FindBy (xpath = "//*[@id='firstname']")
    private WebElement firstName;

    @FindBy (xpath = "//*[@id='lastname']")
    private WebElement lastName;

    @FindBy (xpath = "(//input[contains(@id,'email')])[1]")
    private WebElement eMail;

    @FindBy (xpath = "(//input[contains(@name,'pass')])[1]")
    private WebElement password;

    @FindBy (xpath = "(//input[contains(@name,'password_confirmation')])[1]")
    private WebElement confirmPassword;

    @FindBy (xpath = "//button[@title='Create an Account']")
    private WebElement createAccountButton;
    @FindBy (xpath = " //*[text()='Thank you for registering with Fake Online Clothing Store.']")
    private WebElement verifyAccount;

    @FindBy (xpath = "(//a[@href='https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS8%2C/'])[1]")
    private WebElement sıgnIn1;

    @FindBy (xpath = "(//span[text()='Sign In'])[1]")
    private WebElement sıgnIn2;

    @FindBy (xpath = "(//span[@class='logged-in'])[1]")
    private WebElement verifyLogin;







    WebElement myElement;

    public void findAndClick(String strElement) {
        switch (strElement) {
            case "createAccount":myElement = createAccount;break;
            case "createAccountButton":myElement=createAccountButton;break;
            case "sıgnIn1":myElement=sıgnIn1;break;
            case "sıgnIn2":myElement=sıgnIn2;break;

        }

        clickFunction(myElement);
    }
    public void findAndSend(String strElement,String value){
        switch (strElement) {
            case "firstName":myElement=firstName;break;
            case "lastName":myElement=lastName;break;
            case "eMail":myElement=eMail;break;
            case "password":myElement=password;break;
            case "confirmPassword":myElement=confirmPassword;break;

        }
        sendKeysFunction(myElement,value);
    }
    public void findAndVerifyText(String strElement,String value){
        switch (strElement){
            case "verifyAccount":myElement=verifyAccount;break;
            case "verifyLogin":myElement=verifyLogin;break;

        }
        verifyContainsText(myElement,value);

    }

}
