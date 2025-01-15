import com.shaft.driver.SHAFT;
import org.testng.annotations.Test;

public class Test_LoginPage extends BaseTest {
    @Test
    public void testSuccessfulLogin(){

        new LogInPage(driver).Successful_Login("Admin" , "admin123");





    }
    @Test
    public void testInvalidPassword(){

//        new LogInPage(driver).Successful_Login("Admin" , "admin123");
        new LogInPage(driver).InvalidPassword("Admin", "12345");




    }
    @Test
    public void testInvalidUserName(){

//        new LogInPage(driver).Successful_Login("Admin" , "admin123");
        new LogInPage(driver).InvalidUserName("blabla", "admin123");




    }
    @Test
    public void testEmptyUserName(){

//        new LogInPage(driver).Successful_Login("Admin" , "admin123");
        new LogInPage(driver).EmptyUserName("","admin123");




    }
    @Test
    public void testEmptyPassword(){

//        new LogInPage(driver).Successful_Login("Admin" , "admin123");
        new LogInPage(driver).EmptyUserPssword("Admin" , "");




    }
    @Test
    public void testBothEmpaty(){

//        new LogInPage(driver).Successful_Login("Admin" , "admin123");
        new LogInPage(driver).bothEmpty("","");




    }
}
