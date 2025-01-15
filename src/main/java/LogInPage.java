import com.shaft.driver.SHAFT;
import com.shaft.gui.element.internal.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Objects;

public class LogInPage {
    //Driver With SHAFT
    SHAFT.GUI.WebDriver driver;
    //Constructor
    public LogInPage(SHAFT.GUI.WebDriver driver){this.driver =driver;}
    //Locators
    By user_name = By.xpath("//input[@name=\"username\"]");
    By pass_word = By.xpath("//input[@name=\"password\"]");
    By login = By.xpath("//button[@type=\"submit\"]");
    By InvalidMassage = By.linkText("Invalid credentials");
    By requiredMassage = By.linkText("required");
    By widgets = By.xpath("//button[@class=\"oxd-glass-button orangehrm-upgrade-button\"]");


    //Actions
    //addusername
    private void addUserName(String user){
        driver.element().type(user_name,user);
    }
    private void addPassword(String pass){
        driver.element().type(pass_word ,pass);
    }
    private Actions setlogin(){
        return driver.element().click(login);
    }
    public void Successful_Login(String user , String password_){
       addUserName(user);
       addPassword(password_);
       setlogin();
//        List < WebElement> list_widgets = driver.getDriver().findElements(widgets);
//        list_widgets.size();
      driver.assertThat().element(widgets);
    }

    public void InvalidUserName(String user , String password){
        addUserName(user);
        addPassword(password);
        setlogin();
        driver.element().assertThat(InvalidMassage);
    }
    public void InvalidPassword(String user , String password){
        addUserName(user);
        addPassword(password);
        setlogin();

       driver.element().assertThat(InvalidMassage);
    }
    public void EmptyUserName(String user , String password){
        addUserName(user);
        addPassword(password);
        setlogin();
        driver.assertThat().element(requiredMassage);
    }
    public void EmptyUserPssword(String user , String password){
        addUserName(user);
        addPassword(password);
        setlogin();
        driver.assertThat().element(requiredMassage);
    }
    public void bothEmpty(String user , String password){
        addUserName(user);
        addPassword(password);
        setlogin();
        driver.assertThat().element(requiredMassage);
    }


}
