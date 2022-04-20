package stepdefinitions.paylocitysteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.paylocitypage.LoginPage;
import utils.ConfigReader;
import utils.DriverHelper;

public class LoginPageSteps {


    WebDriver driver = DriverHelper.getDriver();
     LoginPage loginPage = new LoginPage(driver);


    @Given("an Employer")
    public void an_employer() {

       // driver.get( "file:///Users/aikerim/Desktop/PAYLOCITY-Cucumber%20Project/login.html"  );
       driver.navigate().to(ConfigReader.readProperty("paylocityurl"));
    }
    @Given("I am on the Benefits Dashboard page")
    public void i_am_on_the_benefits_dashboard_page() {

        loginPage.login(ConfigReader.readProperty("paylocityusername"),ConfigReader.readProperty("paylocitypassword"));
    }
    @When("I select Add Employee")
    public void i_select_add_employee() {
        loginPage.addNewEmployee();
    }




    @Then("I should be able to enter employee details")
    public void i_should_be_able_to_enter_employee_details() {



    }


    @Then("First Name does not begin with “A” or “a”")
    public void first_name_does_not_begin_with_a_or_a() {


    }


    @Then("the employee should save")
    public void the_employee_should_save() {


    }


    @Then("I should see the employee in the table")
    public void i_should_see_the_employee_in_the_table() {


    }


    @Then("the benefit cost calculations are correct")
    public void the_benefit_cost_calculations_are_correct() {


    }


}
