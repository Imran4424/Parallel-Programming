import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Substraction
 */
public class Substraction extends UnicastRemoteObject implements Calculator
{

    /**
     * Implementations must have a explicit constructor
     * in order to throw RemoteException exception
     */
    
    
    public Substraction() throws RemoteException
    {
        super();

        /**
        * super keyword use to called parent constructor
        * super can be used to do more specific work like
        * 
        * super(arguments) to called parent constructor who accepts arguments
        *
        * super can also use to called parent class method that is  - super.aMethod()
        *
        * and we all know that what constructor is, constructure initialize the object values with given values
        *
        * for default constructors, the object values will be initialized with default values
        */
    }
}