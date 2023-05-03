package StepDefinitinos;

import Pages.AddressContent;
import Pages.DialogContent;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import javax.xml.crypto.Data;
import java.security.SecureRandom;
import java.util.List;

public class AddressStep {
    AddressContent ac=new AddressContent();
    DialogContent dc=new DialogContent();
    @And("My Account login")
    public void myAccountLogin(DataTable elements) {
        List<String>listElement=elements.asList(String.class);
        for (int i = 0; i < listElement.size(); i++) {
            ac.findAndClick(listElement.get(i));
        }
    }

    @And("Manage Address")
    public void manageAddress(DataTable elements) {
        List<String>listElement=elements.asList(String.class);
        for (int i = 0; i < listElement.size(); i++) {
            ac.findAndClick(listElement.get(i));
        }
    }

    @And("Filling in the address form")
    public void fillingInTheAddressForm(DataTable elements) {
        List<List<String>>listElement=elements.asLists(String.class);
        for (int i = 0; i < listElement.size(); i++) {
            ac.findAndSend(listElement.get(i).get(0),listElement.get(i).get(1));

        }
    }
    @And("Select State")
    public void selectState(DataTable elements) {
        List<String>listElement=elements.asList(String.class);
        for (int i = 0; i < listElement.size(); i++) {
            ac.selectFunction(listElement.get(i));
        }
    }


    @And("Save Button Click")
    public void saveButtonClick(DataTable elements) {
        List<String>listElement=elements.asList(String.class);
        for (int i = 0; i < listElement.size(); i++) {
            ac.findAndClick(listElement.get(i));
        }
    }

    @Then("verify Address succesfully")
    public void verifyAddressSuccesfully(DataTable elements) {
        List<List<String>>listElement=elements.asLists(String.class);
        for (int i = 0; i < listElement.size(); i++) {
            ac.findAndVerifyText(listElement.get(i).get(0), listElement.get(i).get(1));

        }
    }


}
