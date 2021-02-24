package javasample5;

public class Registration {
	public static void main(String[] args) {
		RegistrationImplement check=new RegistrationImplement();

		while (true) {
			System.out.println("Enter Your First Name: ");
			String firstName = "Pankhudi";
			check.firstNameValid(firstName);

			System.out.println("Enter Your Last Name");
			String lastName = "Agarwal";
			check.firstNameValid(lastName);

			System.out.println("Enter Your EmailID");
			String email = "panagarwal03@gmail.com";
			check.emailValid(email);

			System.out.println("Enter Your MobileNumber");
			String number = "9082406722";
			check.phoneValid(number);

			System.out.println("Enter Your Password ");
			String pass = "p031998_A";
			check.passwordValid(pass);

			System.out.println("Check Following Email Sample is valid or Invalid");
			check.emailSampleValid("abc@yahoo.com");
			check.emailSampleValid("abc-100@yahoo.com");
			check.emailSampleValid("abc.100@yahoo.com");
			check.emailSampleValid("abc111@abc.com");
			check.emailSampleValid("abc-100@abc.net");
			check.emailSampleValid("abc.100@abc.com.au");
			check.emailSampleValid("abc@1.com");
			check.emailSampleValid("abc@gmail.com.com");
			check.emailSampleValid("abc+100@gamil.com");
		}

	}
}
