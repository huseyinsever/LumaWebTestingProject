package StepDefinitinos;

import Pages.AddressContent;
import Pages.DialogContent;
import Pages.PlaceOrderContent;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.util.List;

public class PlaceOrderStep {
    DialogContent dc=new DialogContent();
    PlaceOrderContent pc=new PlaceOrderContent();
    AddressContent ac=new AddressContent();
    @Given("Whats new Click")
    public void whatsNewClick(DataTable elements) {
        List<String>listElement=elements.asList(String.class);
        for (int i = 0; i < listElement.size(); i++) {
            pc.findAndClick(listElement.get(i));
        }
    }

    @And("New To product")
    public void newToProduct(DataTable elements) {
        List<String>listElement=elements.asList(String.class);
        for (int i = 0; i < listElement.size(); i++) {
            pc.findAndClick(listElement.get(i));
        }
    }

    @And("Product feature selection")
    public void productFeatureSelection(DataTable elements) {
        List<String>listElement=elements.asList(String.class);
        for (int i = 0; i < listElement.size(); i++) {
            pc.findAndClick(listElement.get(i));
        }
    }
    @And("Verify Product Succesfully")
    public void verifyProductSuccesfully(DataTable elements) {
        List<List<String>>listElement=elements.asLists(String.class);
        for (int i = 0; i < listElement.size(); i++) {
            pc.findAndVerifyText(listElement.get(i).get(0),listElement.get(i).get(1));
        }
    }


    @And("My Chart Click")
    public void myChartClick(DataTable elements) {
        List<String>listElement=elements.asList(String.class);
        for (int i = 0; i < listElement.size(); i++) {
            pc.findAndClick(listElement.get(i));
        }
    }

    @And("Shipping method")
    public void shippingMethod(DataTable elements) {
        List<String>listElement=elements.asList(String.class);
        for (int i = 0; i < listElement.size(); i++) {
            pc.findAndClick(listElement.get(i));
        }
    }

    @And("Payment method")
    public void paymentMethod(DataTable elements) {
        List<String>listElement=elements.asList(String.class);
        for (int i = 0; i < listElement.size(); i++) {
            pc.findAndClick(listElement.get(i));
        }
    }

    @Then("Verify Message succesfully")
    public void verifyMessageSuccesfully(DataTable elements) {
        List<List<String>>listElement=elements.asLists(String.class);
        for (int i = 0; i < listElement.size(); i++) {
            pc.findAndVerifyText(listElement.get(i).get(0),listElement.get(i).get(1));
        }
    }


}
