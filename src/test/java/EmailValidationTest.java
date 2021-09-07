import com.bridgelabz.UserRegistration;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class EmailValidationTest {
    private String emailId;
    private boolean result;

    public EmailValidationTest(String emailId, boolean result){
        this.emailId = emailId;
        this.result = result;
    }
    @Parameterized.Parameters
    public static Collection diffEmails() {
        return Arrays.asList(new Object[][]{{"abc@yahoo.com", true}, {"abc-100@yahoo.com", true},
                {"abc.100@yahoo.com", true}, {"abc111@abc.com", true}, {"abc-100@abc.net", true},
                {"abc.100@abc.com.au", true}, {"abc@1.com", true}, {"abc@gmail.com.co", true},
                {"abc+100@gmail..com", true}});
    }

    @Test
    public void givenEmailAsVar_ShouldReturnAsPerParameterizedResult() {
        UserRegistration validator = new UserRegistration();
        boolean result = validator.validEmail(this.emailId);
        Assertions.assertEquals(this.result, result);
    }
}
