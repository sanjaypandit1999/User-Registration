import com.bridgelabz.UserRegistration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserValidatorTest {
    @Test
    public  void givenFirstName_WhenProper_ShouldReturnTrue() {
        UserRegistration valid = new UserRegistration();
        boolean result = valid.validateFirstName("Sanjay");
        Assertions.assertTrue(result);
    }
}
