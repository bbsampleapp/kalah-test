package io.filer.kalah.feature;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.deps.com.google.gson.Gson;
import io.filer.kalah.service.model.GameStarted;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class KalahSteps extends KalahIntegrationTest{

    @When("^the client calls /games$")
    public void the_client_calls_games() throws Throwable {
        executePost("https://kalah-service.mybluemix.net/games");
    }

    @When("^the client calls /games/gamieid/pits/pitid$")
    public void theClientCallsGamesGameidPitsPitid() throws Throwable {
        GameStarted gameStarted = new Gson().fromJson(latestResponse.getBody(), GameStarted.class);
        executePut("https://kalah-service.mybluemix.net/games/" + gameStarted.getId() + "/pits/4");
    }

    @Then("^the client receives a gameid, url and status code '(\\d+)'$")
    public void theClientReceivesAGameidUrlAndStatusCode(int statusCode) throws Throwable {
        assertThat(latestResponse.getTheResponse().getStatusCode().value(), is(statusCode));
        assertThat(latestResponse.getBody(), containsString("id"));
        assertThat(latestResponse.getBody(), containsString("url"));

        //TODO we could improve assertions here
    }

    @Then("^the client receives a gameid, url, state and status code '(\\d+)'$")
    public void theClientReceivesAGameidUrlStateAndStatusCode(int statusCode) throws Throwable {
        assertThat(latestResponse.getTheResponse().getStatusCode().value(), is(statusCode));
        assertThat(latestResponse.getBody(), containsString("id"));
        assertThat(latestResponse.getBody(), containsString("url"));
        assertThat(latestResponse.getBody(), containsString("state"));

        //TODO we could predict expected state of response but just checking existence of
        //data for now
    }
}
