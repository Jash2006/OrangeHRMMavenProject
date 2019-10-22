package OrangeHRMMavenProject;

import org.openqa.selenium.By;

public class Loginpage extends Utils {
    LoadProps props=new LoadProps();
    private By _Username = By.id("txtUsername");
    private By _Password = By.id("txtPassword");
    private By _loginbutton = By.id("btnLogin");


    public void assertUserIsOnHomePage(){
        assertURL(props.getProperty("url"));
    }
    public void userEntersValidCredentialsForLogIn() {
        enterText(_Username, "Admin");
        enterText(_Password, "admin123");
    }
    public void userClickOnLogin(){
        clickElement(_loginbutton);
    }


    public void userEnterInvalidCredentialsForLogin(String username, String password){
        enterText(_Username,username);
        enterText(_Password,password);


    }
}
