import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * ImplementingCalculator
 */
public class ImplementingCalculator extends UnicastRemoteObject implements Calculator 
{
    /**
     * Implementations must have a explicit constructor
     * in order to throw RemoteException exception
     */

     public ImplementingCalculator() throws RemoteException
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
          * and we all know
          */
     }
    
}