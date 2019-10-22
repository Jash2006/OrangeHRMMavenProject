package OrangeHRMMavenProject;

import org.openqa.selenium.By;

public class DashBoardPage extends Utils {
    LoadProps loadProps=new LoadProps();
    private By _welcomemsg = By.xpath("//a[@id='welcome']");

    public void assertUserIsOnDashboardPage(){
        assertURLText("dashboard");
    }
    public void assertWelComeMessage(){
        assertMessage(props.getProperty("message"),_welcomemsg);
    }
}
