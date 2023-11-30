package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class SmokeSteps {
    @Given("I print hello world")
    public void i_print_hello_world() {
        System.out.println("Test 1");
    }
    @Then("everybody is happy")
    public void everybody_is_happy() {
        System.out.println("Test 2");

    }
}
