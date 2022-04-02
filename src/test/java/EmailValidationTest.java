import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmailValidationTest {

    @Test
    void EmailValidationItShouldReturnValidOrNot() {
        EmailValidation email = new EmailValidation();
        assertTrue(email.validEmail("abc.123"));
        assertTrue(email.validEmail("Swapnil.77"));
    }
}