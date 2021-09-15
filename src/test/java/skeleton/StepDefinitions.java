package skeleton;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import static org.junit.Assert.*;

public class StepDefinitions {

    @Given("a train with the following configuration:")
    public void a_train_with_the_following_configuration(io.cucumber.datatable.DataTable dataTable) {

    }

    @When("a booking for {int} seat is made")
    public void a_booking_for_seat_is_made(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        //   throw new io.cucumber.java.PendingException();
    }
    @Then("the seats should be allocated in Carriage B")
    public void the_seats_should_be_allocated_in_carriage_b() {
        Assert.assertTrue(false);
    }

    @When("user book {int} seats")
    public void user_book_seats(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        // throw new io.cucumber.java.PendingException();
    }
    @Then("the seats should be allocated in Carriage A")
    public void the_seats_should_be_allocated_in_carriage_a() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
    @When("a booking  for {int} seats is made")
    public void a_booking_for_seats_is_made(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
    @Given("user is a registered user")
    public void user_is_a_registered_user() {
        // Write code here that turns the phrase above into concrete actions
        // throw new io.cucumber.java.PendingException();
    }
    //  Some other steps were also undefined:
    @Then("Application prompt a message {string}")
    public void application_prompt_a_message(String string) {

    }
}
