import java.util.regex.Pattern;

public class EmailValidation {

    public boolean validEmail(String email) {
        return Pattern.matches("^([a-zA-Z0-9.])+([0-9a-zA-Z]{0,1}+@([a-zA-Z0-9.])+[a-zA-Z]{2,3})$", email);
    }

}
