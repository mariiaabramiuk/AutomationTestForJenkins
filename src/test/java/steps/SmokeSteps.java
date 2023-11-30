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

    @Given("I run cucumber test")
    public void i_run_cucumber_test() {
        System.out.println("I run cucumber test");
    }
    @Then("verify this is correct test")
    public void verify_this_is_correct_test() {
            for( int i = 0; i <100; i++){
                System.out.println("This is indeed a cucumber test");
            }
    }
}
