import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Calculator
 */
public interface Calculator extends Remote
{
    /**
     * Declaring method prototype
     */
    
    public int sum(int x,int y) throws RemoteException;
}