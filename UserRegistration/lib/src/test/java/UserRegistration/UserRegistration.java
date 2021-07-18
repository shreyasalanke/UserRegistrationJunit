package UserRegistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserRegistration
{

	private static final String NAME_PATTERN = "^[A-Z]{1}[a-z]{2,20}";
	private static final String EMAIL_PATTERN = "^([a-zA-Z0-9]+[._+-]{1}[a-zA-Z0-9]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}([.][a-z]{2,4})?$";
	private static final String MOBILE_PATTERN = "^[0-9]{0,2}[ ][0-9]{10}";
	private static final String PASSWORD_PATTERN = "(?=.*[A-Z]+)(?=.*[0-9]+).{8,}";

	public boolean validateFirstName(String fname) throws UserException
	{
        return patternChecker(fname, NAME_PATTERN);
    }
    public boolean validateLastName(String lName) throws UserException
    {
        return patternChecker(lName, NAME_PATTERN);
    }
    public boolean validateEmailId(String emailId) throws UserException
    {
		return patternChecker(emailId, EMAIL_PATTERN);
	}
    public boolean validateMobileNum(String mobileNum) throws UserException
    {
		return patternChecker(mobileNum, MOBILE_PATTERN);
	
	}
    public boolean validatePassword(String password) throws UserException
    {
		return patternChecker(password, PASSWORD_PATTERN);
	}

    private boolean patternChecker(String input,String fieldPattern) throws UserException
    {
        Pattern pattern = Pattern.compile(fieldPattern);
        Matcher matcher = pattern.matcher(input);
        try 
        {
			boolean result = matcher.matches();
			if (!result)
				throw new UserException(UserException.ExceptionType.ENTERED_INVALID,
						"Please give a valid Entry");
			return result;
		} 
        catch (NullPointerException exception)
        {
			throw new UserException(UserException.ExceptionType.ENTERED_NULL,
					"Entry Should not be null ");
		}
    }
    
    public void firstNameValidate() //First name validation.
    {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your first name");
		String name = sc.next();

		Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{2,20}$");
		Matcher matcher = pattern.matcher(name);
		if (matcher.matches())
		{
		} 
		else
		{
			System.out.println("Given name id is not valid");
		}	
	}

	
	public void lastNameValidate() //last name validation.
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your last name");
		String name = sc.next();

		Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{3,20}$");
		Matcher matcher = pattern.matcher(name);
		if (matcher.matches())
		{
		} else
		{
			System.out.println("Given last name id is not valid");
		}
	}

	public void emailValidate() //Email validation.
	{
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Email id");
        String email = sc.next();

        Pattern pattern = Pattern.compile("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$");
        Matcher matcher = pattern.matcher(email);
        if(matcher.matches())
        {
        }else
        {
            System.out.println("Given email id is not valid");
        }
	}

	public void mobileValidate() //Mobile number validation.
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your Mobile number");
		String mobile = sc.nextLine();

		Pattern pattern = Pattern.compile("^[0-9]{0,2}[ ][0-9]{10}");
		Matcher matcher = pattern.matcher(mobile);
		if (matcher.matches()) 
		{
		}
		else
		{
			System.out.println("Given mobile number. is not valid");
		}
	}

	
	public void passwordValidate() //password validation.
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your Password");
		String password = sc.next();

		Pattern pattern = Pattern.compile("^(?=.{8,20})(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$");
		Matcher matcher = pattern.matcher(password);
		if (matcher.matches())
		{
		} else
		{
			System.out.println("Given password is not valid");
		}
	}
}