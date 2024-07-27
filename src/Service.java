import java.util.Scanner;
import java.util.regex.Pattern;

public class Service {

    public static void isValid(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        Pattern allowedChars = Pattern.compile("[a-zA-Z_0-9]+");
        int maxLength = 20;
        if ((login.length() > maxLength) || !(allowedChars.matcher(login).matches())) throw new WrongLoginException();
        if ((password.length() > maxLength) || !(allowedChars.matcher(password).matches()) || !(password.equals(confirmPassword))) throw new WrongPasswordException();
    }
    ///!(login.length() > maxLength) ||
}

