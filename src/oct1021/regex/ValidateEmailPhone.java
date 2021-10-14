package oct1021.regex;

import java.util.regex.Pattern;

public class ValidateEmailPhone {

	public static void main(String[] args) {
		 boolean email1 = isEmailValid("firstname@gmail.com");
		 System.out.println("email1 : " + email1);
		 boolean email2 = isEmailValid("virendra@gmail.com");
		 System.out.println("email2 : " + email2);
		 boolean email3 = isEmailValid("test123prepare@co.edu.com");
		 System.out.println("email3 : " + email3);
		 
		 boolean phone1 = isPhoneValid("9873333333");
		 System.out.println("phone1 : " + phone1);
		 boolean phone2 = isPhoneValid("test123prepare@co.edu.com");
		 System.out.println("phone2 : " + phone2);
		 boolean phone3 = isPhoneValid("test123prepare@co.edu.com");
		 System.out.println("phone3 : " + phone3);
	}
	
	public static boolean isEmailValid(String email) {
	    final Pattern EMAIL_REGEX = Pattern.compile("\\b[A-Z0-9._%-]+@[A-Z0-9.-]+\\.[A-Z]{2,4}\\b", Pattern.CASE_INSENSITIVE);
	    return EMAIL_REGEX.matcher(email).matches();
	}
	
	public static boolean isPhoneValid(String phone) {
		 final Pattern PHONE_REGEX = Pattern.compile("^(?:(?:\\+|0{0,2})91(\\s*[\\ -]\\s*)?|[0]?)?[789]\\d{9}|(\\d[ -]?){10}\\d$", Pattern.CASE_INSENSITIVE);
		 return PHONE_REGEX.matcher(phone).matches();
	}
	
	
	

}
