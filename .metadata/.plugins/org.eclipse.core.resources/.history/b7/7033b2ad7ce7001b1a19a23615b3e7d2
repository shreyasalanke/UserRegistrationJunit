package UserRegistration;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
	UserRegistration userRegistration = new UserRegistration();

    @Test
     public void givenFirstName_WhenFirstLetterUpperCase_ShouldReturnTrue()
    {
	 boolean result = userRegistration.validateFirstName("Shreya");
	 Assert.assertTrue(result);
	}
    
     @Test
     public void givenFirstName_WhenLessThanThreeChars_ShouldReturnFalse()
     {
	   boolean result = userRegistration.validateFirstName("Sh");
	   Assert.assertFalse(result);
    }
    
     @Test
 	public void givenFirstName_WhenHasNumber_ShouldReturnFalse()
     {
 		boolean result = userRegistration.validateFirstName("Shreya15");
 		Assert.assertFalse(result);
 	}

    @Test
    public void givenFirstName_WhenHasSpecialChar_ShouldReturnFalse()
    {
	  boolean result = userRegistration.validateFirstName("Shrey@");
	  Assert.assertFalse(result);
   }

}
