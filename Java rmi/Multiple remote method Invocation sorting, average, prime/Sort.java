import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Sort
 */
public interface Sort extends Remote
{
    /**
     * Declaring method prototype
    */

    public int[] Sorted(int[] ar, int size) throws RemoteException;
    
}