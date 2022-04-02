import java.util.regex.Pattern;

public class EmailValidation {

    public boolean validEmail(String email) {
        return Pattern.matches("([a-zA-Z0-9.]+)", email);
    }

}
