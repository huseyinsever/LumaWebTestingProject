package Pages;

import Utilities.GWD;
import io.cucumber.java.eo.Se;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddressContent extends Parent {
    public AddressContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy (xpath = "(//button[@class='action switch'])[1]")
    private  WebElement changeButton;

    @FindBy (xpath = "(//a[text()='My Account'])[1]")
    private  WebElement myAccount;

    @FindBy (xpath = "(//span[text()='Manage Addresses'])[1]")
    private  WebElement manageAddressClick;

    @FindBy (xpath = "//span[text()='Add New Address']")
    private  WebElement newAddresButton;

    @FindBy (xpath = "//input[@id='telephone']")
    private  WebElement phone;

    @FindBy (xpath = "//input[@id='street_1']")
    private  WebElement street1;

    @FindBy (xpath = "//input[@id='street_2']")
    private  WebElement street2;

    @FindBy (xpath = "//input[@id='street_3']")
    private  WebElement street3;

    @FindBy (xpath = "//input[@id='city']")
    private  WebElement city;

    @FindBy (xpath = "//input[@id='zip']")
    private  WebElement zipCode;

    @FindBy (xpath = "//select[@id='region_id']")
    private  WebElement stateProvince;

    @FindBy (xpath = "//span[text()='Save Address']")
    private  WebElement saveButton;

    @FindBy (xpath = "//*[text()='You saved the address.']")
    private  WebElement verifyAddress;




    WebElement myElement;
    public void findAndClick(String strElement) {
        switch (strElement) {
            case "changeButton":myElement=changeButton;break;
            case "myAccount":myElement=myAccount;break;
            case "manageAddressClick":myElement=manageAddressClick;break;
            case "newAddresButton":myElement=newAddresButton;break;
            case "saveButton":myElement=saveButton;break;

        }
        clickFunction(myElement);
    }

    public void findAndSend(String strElement,String value){
        switch (strElement) {
            case "phone":myElement=phone;break;
            case "street1":myElement=street1;break;
            case "street2":myElement=street2;break;
            case "street3":myElement=street3;break;
            case "city":myElement=city;break;
            case "zipCode":myElement=zipCode;break;
            case "stateProvince":myElement=stateProvince;break;

        }
        sendKeysFunction(myElement,value);
    }
    public void findAndVerifyText(String strElement,String value){
        switch (strElement){
            case "verifyAddress":myElement=verifyAddress;break;

        }
        verifyContainsText(myElement,value);

    }
    public void selectFunction(String value){
        waitUntilClickable(stateProvince);
        Select stateSelect=new Select(stateProvince);
        stateSelect.selectByIndex(Integer.parseInt(value));

    }



}
