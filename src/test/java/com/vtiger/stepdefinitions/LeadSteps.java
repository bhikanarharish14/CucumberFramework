package com.vtiger.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class LeadSteps extends BaseSteps {
    @When("user clicks on new lead and fills all mandatory fields and clicks on save button")
    public void user_clicks_on_new_lead_and_fills_all_mandatory_fields_and_clicks_on_save_button(io.cucumber.datatable.DataTable dataTable) {

        List<List<String>> lst = dataTable.asLists(String.class);


        for (List<String> ls: lst) {

            ldp.ClickNewLead();
            ldp.CreateLead(ls.get(0),ls.get(1));
        }
    }
    @Then("lead should be created")
    public void lead_should_be_created() {

    }



}
