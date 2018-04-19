import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Calcutalor
 */
public interface Calcutalor extends Remote
{
    /**
     * Declaring method prototype
     */
    
    public int sum(int x,int y) throws RemoteException
}