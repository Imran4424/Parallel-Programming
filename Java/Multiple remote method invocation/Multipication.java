import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Multipication
 */
public class Multipication extends UnicastRemoteObject implements Calculator
{
    /**
     * Implementations must have a explicit constructor
     * in order to throw RemoteException exception
     */
    
    public Multipication() throws RemoteException
    {
        super
    }
}