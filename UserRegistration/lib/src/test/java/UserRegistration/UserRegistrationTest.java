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
	    
	    @Test
		public void givenLastName_WhenFirstLetterUpperCase_ShouldReturnTrue()
	    {
		    boolean result = userRegistration.validateLastName("Salanke");
		    Assert.assertTrue(result);
		}
		
		@Test 
		public void givenLastName_WhenLessThanThreeChar_shouldReturnFalse() 
		{
			boolean result = userRegistration.validateLastName("Sa");
			Assert.assertFalse(result);
		}
		
		@Test
		  public void givenLastName_WhenHasNumber_ShouldReturnFalse()
		{
		      boolean result = userRegistration.validateLastName("Salanke18");
		      Assert.assertFalse(result);
		  }

		  @Test
		  public void givenLastName_WhenHasSpecialChar_ShouldReturnFalse()
		  {
		      boolean result = userRegistration.validateLastName("$alanke");
		      Assert.assertFalse(result);
		  }
		  @Test
		    public void givenEmailId_WhenProper_ShouldReturnTrue(){
		        boolean result = userRegistration.validateEmailid("shreyasalanke97@gmail.com");
		        Assert.assertTrue(result);
		    }
		  @Test
		    public void givenMobileNum_WhenSpaceIsMentioned_ShouldReturnTrue()
		  {
		        boolean result = userRegistration.validateMobileNum("91 7353078538");
		        Assert.assertTrue(result);
		    }
		  
		    @Test
		    public void givenMobileNum_WhenSpaceNotMentioned_ShouldReturnFalse() {
		        boolean result = userRegistration.validateMobileNum("918618829913");
		        Assert.assertFalse(result);
		    }
		    @Test
		    public void givenMobileNum_WhenLessDigits_ShouldReturnFalse() 
		    {
		        boolean result = userRegistration.validateMobileNum("98454");
		        Assert.assertFalse(result);
		    }
		    @Test
		    public void givenMobileNum_WhenNotStartWith91_ShouldReturnFalse()
		    {
		        boolean result = userRegistration.validateMobileNum("5432519");
		        Assert.assertFalse(result);
		    }
		    @Test
			public void givenPassword_WhenMin8Chars_ShouldReturnTrue() {
				boolean result = userRegistration.validatePassword("Nethaji@123");
				Assert.assertTrue(result);
			}

			@Test
			public void givenPassword_WhenAtleast1UpperCase_ShouldReturnTrue() {
				boolean result = userRegistration.validatePassword("asd56RIU%^");
				Assert.assertTrue(result);
			}

			@Test
			public void givenPassword_WhenAtleast1Number_ShouldReturnTrue() {
				boolean result = userRegistration.validatePassword("ZRgdrV6!");
				Assert.assertTrue(result);
			}

			@Test
			public void givenPassword_WhenNoNumeric_ShouldReturnFalse() {
				boolean result = userRegistration.validatePassword("Abvctr*");
				Assert.assertFalse(result);
			}

			@Test
			public void givenPassword_WhenHasExact1SpecialChar_ShouldReturnTrue() {
				boolean result = userRegistration.validatePassword("QWErty%34");
				Assert.assertTrue(result);
			}

			@Test
			public void givenPassword_WhenNoSpecialChar_ShouldReturnFlase() {
				boolean result = userRegistration.validatePassword("Sharan165");
				Assert.assertTrue(result);
			}

			@Test
			public void givenPassword_WhenHasMoreThan1SpecialChar_ShouldReturnFalse() {
				boolean result = userRegistration.validatePassword("$Hreya@185");
				Assert.assertTrue(result);
			}

		}
	 

