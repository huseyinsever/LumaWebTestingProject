package StepDefinitinos;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class RegisterStep {
    DialogContent dc=new DialogContent();
    @Given("Navigate to basqar")
    public void navigateToBasqar() {
        GWD.getDriver().get("https://magento.softwaretestingboard.com/");
        GWD.getDriver().manage().window().maximize();
    }

    @When("Click Create ann Account")
    public void clickCreateAnnAccount(DataTable elements) {
        List<String>listElement=elements.asList(String.class);
        for (int i = 0; i < listElement.size(); i++) {
            dc.findAndClick(listElement.get(i));

        }
    }

    @And("Filling out the form")
    public void fillingOutTheForm(DataTable elements) {
        List<List<String>>listElement=elements.asLists(String.class);
        for (int i = 0; i < listElement.size(); i++) {

            dc.findAndSend(listElement.get(i).get(0),listElement.get(i).get(1));

        }


    }

    @Then("verify succesfully")
    public void verifySuccesfully(DataTable elements) {
        List<List<String>>listElement=elements.asLists(String.class);
        for (int i = 0; i < listElement.size(); i++) {
            dc.findAndVerifyText(listElement.get(i).get(0),listElement.get(i).get(1));

        }
    }
}
