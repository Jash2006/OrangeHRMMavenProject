package OrangeHRMMavenProject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepdefs extends Utils {
    Loginpage loginpage =new Loginpage();
    ValidateCredentialPage validateCredentialPage=new ValidateCredentialPage();
    DashBoardPage dashBoardPage=new DashBoardPage();
    @Given("^I am on the Home Page of OrangeHRM website$")
    public void iAmOnTheHomePageOfOrangeHRMWebsite() {
        loginpage.assertUserIsOnHomePage();
    }

    @When("^I enter Username as \"([^\"]*)\"and Password as \"([^\"]*)\"$")
    public void iEnterUsernameAsAndPasswordAs(String username, String password ){
        loginpage.userEnterInvalidCredentialsForLogin(username,password);

    }
    @Then("^I should see the \"([^\"]*)\"$")
    public void iShouldSeeThe(String error_message) {
      validateCredentialPage.assertErrorMessage(error_message);
    }
    @When("^I enter valid Username and Password$")
    public void iEnterValidUsernameAndPassword() {
        loginpage.userEntersValidCredentialsForLogIn();
    }
    @And("^I click on LOGIN$")
    public void iClickOnLOGIN() {
        loginpage.userClickOnLogin();
    }
    @Then("^I should navigate to Dashboard page and 'Welcome Admin' message on right top corner$")
    public void iShouldNavigateToDashboardPageAndWelcomeAdminMessageOnRightTopCorner() {
      dashBoardPage.assertUserIsOnDashboardPage();
      dashBoardPage.assertWelComeMessage();
    }
}
