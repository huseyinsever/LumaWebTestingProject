package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PlaceOrderContent extends Parent{
    public PlaceOrderContent() {
        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy (xpath = "//a[@id='ui-id-3']//span")
    private WebElement whatNewButton;

    @FindBy (xpath = "//*[contains(text(),'Phoebe Zipper Sweatshirt')]")
    private WebElement productClick;

    @FindBy (xpath = "(//*[contains(text(),'XL')])[1]")
    private WebElement size;

    @FindBy (xpath = "//div[@aria-label='Purple']")
    private WebElement color;

    @FindBy (xpath = "//*[text()='Add to Cart']")
    private WebElement addToChart;

    @FindBy (xpath = "//div[@role='alert']//div//div")
    private WebElement productVerifysuccesfully;

    @FindBy (xpath = "//a[@class='action showcart']")
    private WebElement myCart;

    @FindBy (xpath = "//button[@class='action primary checkout']")
    private WebElement procedToCheckout;

    @FindBy (xpath = "(//td[@class='col col-method']//input)[1]")
    private WebElement inputRadio;

    @FindBy (xpath = "//span[text()='Next']")
    private WebElement next;

    @FindBy (xpath = "(//div[@class='primary']//button//span)[5]")
    private WebElement placeOrder;

    @FindBy (xpath = "//span[text()='Thank you for your purchase!']")
    private WebElement verifyOrderMessage;




    WebElement myElement;

    public void findAndClick(String strElement) {
        switch (strElement) {
            case "whatNewButton":myElement=whatNewButton;break;
            case "productClick":myElement=productClick;break;
            case "size":myElement=size;break;
            case "color":myElement=color;break;
            case "addToChart":myElement=addToChart;break;
            case "myCart":myElement=myCart;break;
            case "procedToCheckout":myElement=procedToCheckout;break;
            case "inputRadio":myElement=inputRadio;break;
            case "next":myElement=next;break;
            case "placeOrder":myElement=placeOrder;break;

        }

        clickFunction(myElement);
    }
    public void findAndVerifyText(String strElement,String value){
        switch (strElement){
            case "productVerifysuccesfully":myElement=productVerifysuccesfully;break;
            case "verifyOrderMessage":myElement=verifyOrderMessage;break;
        }
        verifyContainsText(myElement,value);

    }


}
