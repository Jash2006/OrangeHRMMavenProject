package OrangeHRMMavenProject;

import org.openqa.selenium.By;

public class ValidateCredentialPage extends Utils {
    LoadProps loadProps = new LoadProps();
    private By _errormsg = By.xpath("//span[@id='spanMessage']");

    public void assertUserIsOnValidateCredentialPage(){
        assertURL(props.getProperty("validatecredentialpageurl"));
    }

    public void assertErrorMessage(String expectedtext){
        assertMessage(expectedtext,_errormsg);
    }

}

