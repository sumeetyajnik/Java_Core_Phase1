package oct1021.regex;

import java.util.regex.Pattern;

public class ValidateEmailPhonePassword {

	public static void main(String[] args) {
		 boolean email1 = isEmailValid("firstname@gmail.com");
		 System.out.println("email1 : " + email1);
		 boolean email2 = isEmailValid("virendra@gmail.com");
		 System.out.println("email2 : " + email2);
		 boolean email3 = isEmailValid("test123prepare@co.edu.com");
		 System.out.println("email3 : " + email3);
		 
		 boolean phone1 = isPhoneValid("9873333333");
		 System.out.println("phone1 : " + phone1);
		 boolean phone2 = isPhoneValid("+919873333333");
		 System.out.println("phone2 : " + phone2);
		 boolean phone3 = isPhoneValid("+9188888");
		 System.out.println("phone3 : " + phone3);
		 boolean phone4 = isPhoneValid("+918888888888888");
		 System.out.println("phone3 : " + phone4);
		 boolean phone5 = isPhoneValid("98733333331");
		 System.out.println("phone5 : " + phone5);
		 boolean phone6 = isPhoneValid("987333333");
		 System.out.println("phone6 : " + phone6);
		 
		 boolean password1 = isPasswordValid("Ar1Tt4l8@p");
		 System.out.println("password1 : " + password1);
	}
	
	public static boolean isEmailValid(String email) {
	    final Pattern EMAIL_REGEX = Pattern.compile("\\b[A-Z0-9._%-]+@[A-Z0-9.-]+\\.[A-Z]{2,4}\\b", Pattern.CASE_INSENSITIVE);
	    return EMAIL_REGEX.matcher(email).matches();
	}
	
	public static boolean isPhoneValid(String phone) {
		 final Pattern PHONE_REGEX = Pattern.compile("^((\\+91)?)[789]{1}\\d{9}$", Pattern.CASE_INSENSITIVE);
		 return PHONE_REGEX.matcher(phone).matches();
	}
	
	
	public static boolean isPasswordValid(String password) {	
	       String regex = "(?=[A-Z])(?=(.*[\\d]){3})(?=.*[a-z])(?=.*[@#$%^&+=])(?=\\S+$).{10,10}$";
		 final Pattern PASSWORD_REGEX = Pattern.compile(regex);
		 return PASSWORD_REGEX.matcher(password).matches();
	}
	
	

}
