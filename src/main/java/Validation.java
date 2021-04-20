import java.util.regex.Pattern;

public class Validation {
	 public boolean validateName(String name) {
	        String nameExp = "^[A-Z]{1}+[a-z]{2,}";
	        return Pattern.matches(nameExp, name);
	    }

	    public boolean validateEmail(String email) {
	        String emailExp = "^([a-z0-9]+[-._+]?[a-zA-Z0-9]+)+@[a-z0-9]+.[a-z]{2,3}.[a-z]{2,3}$";
	        return Pattern.matches(emailExp, email);
	    }

	    public boolean validateMobNum(String phone) {
	        String phoneExp = "[0-9]{2}\\s[0-9]{10}";
	        return Pattern.matches(phoneExp, phone);
	    }

	    public boolean validatePassword(String password) {
	        String passwordExp = "^.*(?=.*[A-Z])(?=.*[0-9])([a-z])(?=.*[@#$%^&+=])(?=.{8,}).*$";
	        return Pattern.matches(passwordExp, password);
	    }

}
