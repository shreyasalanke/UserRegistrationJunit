package UserRegistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserRegistration
{

	private static final String NAME_PATTERN = "^[A-Z][a-z]{2,}";
	private static final String EMAIL_PATTERN = "^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}([.][a-z]{2,4})?$";
	private static final String MOBILE_PATTERN = "^[0-9]{0,2}[ ][0-9]{10}";
	
    
    public boolean validateFirstName(String fname)
    {
        return patternChecker(fname, NAME_PATTERN);
    }
    public boolean validateLastName(String lName)
    {
        return patternChecker(lName, NAME_PATTERN);
    }
    public boolean validateEmailid(String Emailid)
    {
        return patternChecker(Emailid, EMAIL_PATTERN);
    }
    public boolean validateMobileNum(String mobileNum)
    {
		return patternChecker(mobileNum, MOBILE_PATTERN);
	
	}
    
    private boolean patternChecker(String input,String fieldPattern)
    {
        Pattern pattern = Pattern.compile(fieldPattern);
        Matcher matcher = pattern.matcher(input);
        boolean result = matcher.matches();
        return result;
    }
}