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
          *
          */
     }
    
}