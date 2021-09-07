import com.bridgelabz.UserRegistration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserValidatorTest {
    @Test
    public  void givenFirstName_WhenProper_ShouldReturnTrue() {
        UserRegistration valid = new UserRegistration();
        boolean result = valid.validFirstName("Sanju");
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
        boolean result = email.validEmail("abc-100@yahoo.com");
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
        boolean result = pass.validPassWord("San%3145");
        Assertions.assertTrue(result);
    }
    @Test
    void givenDetails_WhenProper_ShouldReturnHAPPY() {
        UserRegistration validator = new UserRegistration();
        String result = validator.validatedUserRegistration("Sanju","Pan","abc-100@yahoo.com",
                "91 8167203013","San%3145");
        Assertions.assertEquals("HAPPY",result);
    }

    @Test
    void givenDetails_WhenImproper_ShouldReturnSAD() {
        UserRegistration validator = new UserRegistration();
        String result = validator.validatedUserRegistration("Sa","pandit","abc@gmail.co",
                "91 5451122610","@how6AreYou");
        Assertions.assertEquals("SAD",result);
    }
}
