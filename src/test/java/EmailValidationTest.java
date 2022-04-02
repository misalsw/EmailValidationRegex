import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmailValidationTest {

    @Test
    void EmailValidationItShouldReturnValidOrNot() {
        EmailValidation email = new EmailValidation();
        assertTrue(email.validEmail("abc.123"));
        assertTrue(email.validEmail("Swapnil.77"));
    }

    @Test
    public void EmailValidationItShouldReturnValidOrNotaddsymbolat() {
        EmailValidation email = new EmailValidation();
        assertTrue(email.validemail("abc.xyz@BridgeLabz"));
        assertTrue(email.validemail("Swapnil.256@BridgeLabz"));
    }

    @Test
    public void EmailValidationItShouldReturnValidOrNotaddDotSymbol() {
        EmailValidation email = new EmailValidation();
        assertTrue(email.validemail("abc.xyz@BridgeLabz.in"));
        assertTrue(email.validemail("Swapnil.256@BridgeLabz"));
    }

    @Test
    public void EmailValidationItShouldReturnValidOrNotaddoptionalpart() {
        EmailValidation email = new EmailValidation();
        assertTrue(email.validemail("abc.xyz@BridgeLabz.org.in"));
        assertTrue(email.validemail("Swapnil.256@BridgeLabz.com.in"));

    }
}