import com.bridgelabz.InvalidException;
import com.bridgelabz.UserRegistration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.regex.Pattern;

public class UserValidatorTest {
    @Test
    public  void givenFirstName_WhenIMProper_ShouldReturnInvalidToUser() {
            try {
                UserRegistration valid = new UserRegistration();
                boolean result = valid.validFirstName("Sanj");
            }
        catch (InvalidException e){
        Assertions.assertEquals(InvalidException.ExceptionType.INVALIDFIRSTNAME, e.type);
            System.out.println(e.getMessage());
        }
    }

    @Test
    void givenFirstname_WhenProper_ShouldReturnTrue() {
        UserRegistration valid = new UserRegistration();
        boolean result = valid.validFirstName("Sanjay");
        Assertions.assertTrue(result);
    }

    @Test
     void givenLastname_WhenImProper_ShouldReturnInvalidMessageToUser() {
        UserRegistration lastname = new UserRegistration();
        try {
            boolean result = lastname.validLastName("pandit");
        }
        catch (InvalidException e){
            Assertions.assertEquals(InvalidException.ExceptionType.INVALIDLASTNAME, e.type);
            System.out.println(e.getMessage());
        }
    }

    @Test
    void givenLastnameWhenProperShouldReturnTrue() {
        UserRegistration lastname = new UserRegistration();
        boolean result = lastname.validLastName("Pandit");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenEmail_WhenImProper_ShouldReturnInvalidMessageToUser() {
        UserRegistration email = new UserRegistration();
        try {
            boolean result = email.validEmail("Abc100@yahoo.com");
        }
        catch (InvalidException e){
            Assertions.assertEquals(InvalidException.ExceptionType.INVALIDEMAIL, e.type);
            System.out.println(e.getMessage());
        }
    }

    @Test
    void givenEmailWhenProperShouldReturnTrue() {
        UserRegistration email = new UserRegistration();
        boolean result = email.validEmail("abc-100@yahoo.com");
        Assertions.assertTrue(result);
    }

    @Test
    public void givePhnNo_WhenInvalid_ShouldReturnInvalidMessageToUser() {
        UserRegistration phnNo =new UserRegistration();
        try {
            boolean result = phnNo.validPhnNo("918167203013");
        }
        catch (InvalidException e) {
            Assertions.assertEquals(InvalidException.ExceptionType.INVALIDPHNNO, e.type);
            System.out.println(e.getMessage());
        }
    }

    @Test
    void givenPhnNoWhenProperShouldReturnTrue() {
        UserRegistration phnNo =new UserRegistration();
        boolean result = phnNo.validPhnNo("91 8167203013");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenPassWord_WhenInvalid_ShouldReturnInvalidToUser() {
        UserRegistration pass = new UserRegistration();
        try {
            boolean result = pass.validPassWord("san%3145");
        }
        catch (InvalidException e) {
            Assertions.assertEquals(InvalidException.ExceptionType.INVALIDPASSWORD, e.type);
            System.out.println(e.getMessage());
        }
    }

    @Test
    void givenPasswordWhenProperShoulReturnTrue() {
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
    void givenDetails_WhenImproper_ShouldReturnInvalidMessagToUser() {
        UserRegistration validator = new UserRegistration();
        try {
            String result = validator.validatedUserRegistration("Sa", "pandit", "abc@gmail.co",
                    "91 5451122610", "@how6AreYou");
        }
        catch (InvalidException e){
            System.out.println("Invalid  User Details");
        }
    }
}
