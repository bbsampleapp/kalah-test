package io.filer.kalah.feature;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class KalahSteps extends KalahIntegrationTest{

    @When("^the client calls /games$")
    public void the_client_calls_games() throws Throwable {
        throw new PendingException();
    }

    @Then("^the client receives status code of (\\d+)$")
    public void the_client_receives_status_code_of(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^the client receives a gameid and url$")
    public void the_client_receives_a_gameid_and_url() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^the client calls '/games/(\\d+)/pits/(\\d+)'$")
    public void the_client_calls_games_gameid_pits_pitid() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^the client receives a gameid, url and state$")
    public void the_client_receives_a_gameid_url_and_state() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
