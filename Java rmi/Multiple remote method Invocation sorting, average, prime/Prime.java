import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Prime
 */
public interface Prime extends Remote
{

    public int[] DeteminingPrime(int[] ar, int size) throws RemoteException;    
}