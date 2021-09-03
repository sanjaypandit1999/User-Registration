import com.bridgelabz.UserRegistration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserValidatorTest {
    @Test
    public  void givenFirstName_WhenProper_ShouldReturnTrue() {
        UserRegistration valid = new UserRegistration();
        boolean result = valid.validFirstName("San");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenLastname_WhenProper_ShouldReturnTrue() {
        UserRegistration lastname = new UserRegistration();
        boolean result = lastname.validLastName("Pan");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenEmail_WhenProper_ShouldReturnTrue() {
        UserRegistration email = new UserRegistration();
        boolean result = email.validEmail("abc.xyz@bl.co.in");
        Assertions.assertTrue(result);
    }

    @Test
    public void givePhnNo_WhenValid_ShouldReturnTrue() {
        UserRegistration phnNo =new UserRegistration();
        boolean result = phnNo.validPhnNo("91 8167203013");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenPassWord_WhenValid_ShouldReturnTrue() {
        UserRegistration pass = new UserRegistration();
        boolean result = pass.validPassWord("Sanju123");
        Assertions.assertTrue(result);
    }
}
