package UserRegistration;

public class UserException extends Exception 
{
	static String message;
    enum ExceptionType
    {
        ENTERED_NULL, ENTERED_INVALID
    }
    ExceptionType type;
    public UserException(ExceptionType type,String message)
    {
        super(message);
        this.type = type;
    }
}
