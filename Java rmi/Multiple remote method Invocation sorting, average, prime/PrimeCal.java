import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * PrimeCal
 */
public class PrimeCal extends UnicastRemoteObject implements Prime
{
    public PrimeCal() throws RemoteException
    {
        super();
    }
    
}