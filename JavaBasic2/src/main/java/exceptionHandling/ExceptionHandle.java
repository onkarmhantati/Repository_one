package exceptionHandling;

/**
 * Created by onkar.mhantati on 5/25/2018.
 */
public class ExceptionHandle  {
    public static void main(String args[])throws UserDefineException{
        throw new UserDefineException("THis is exception.");
    }
}

class UserDefineException extends RuntimeException{
    public UserDefineException(String mess){
        super(mess);
    }

}

