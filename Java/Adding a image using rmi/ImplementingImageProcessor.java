import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


/**
 * ImplementingImageProcessor
 */


public class ImplementingImageProcessor extends UnicastRemoteObject implements ImageProcessor
{
    /**
     * Implementations must have a explicit constructor
     * in order to throw RemoteException exception
     */

    public ImplementingImageProcessor() throws RemoteException
    {
        super();
    }
    
}