import java.util.regex.Pattern;

class UserValidator {
    public boolean isValid(String email, String password) {
        return isValidEmail(email) && isValidPassword(password);
    }

    private boolean isValidEmail(String email) {
        return email != null && Pattern.matches("^[A-Za-z0-9+_.-]+@(.+)$", email);
    }

    private boolean isValidPassword(String password) {
        return password != null && password.length() >= 8;
    }
}
