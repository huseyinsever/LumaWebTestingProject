package StepDefinitinos;

import Pages.DialogContent;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class LoginStep {
    DialogContent dc=new DialogContent();
    @When("Sign In click")
    public void signInClick(DataTable elements) {
        List<String>listElement=elements.asList(String.class);
        for (int i = 0; i < listElement.size(); i++) {
            dc.findAndClick(listElement.get(i));

        }
    }

    @And("valid username or password input")
    public void validUsernameOrPasswordInput(DataTable elements) {
        List<List<String>>listElement=elements.asLists(String.class);
        for (int i = 0; i < listElement.size(); i++) {
            dc.findAndSend(listElement.get(i).get(0),listElement.get(i).get(1));

        }



    }

    @Then("verify Account succesfully")
    public void verifyAccountSuccesfully(DataTable elements) {
        List<List<String>>listElement=elements.asLists(String.class);
        for (int i = 0; i < listElement.size(); i++) {
            dc.findAndSend(listElement.get(i).get(0),listElement.get(i).get(1));

        }

    }
}
