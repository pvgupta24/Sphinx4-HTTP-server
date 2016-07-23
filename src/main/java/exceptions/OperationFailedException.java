package exceptions;

/**
 * Exception thrown when a Process does not complete successfully.
 * Example is in the AudioFileManipulator class
 */
public class OperationFailedException extends Exception
{
    public OperationFailedException()
    {
        super();
    }

    public OperationFailedException(String message)
    {
        super(message);
    }
}