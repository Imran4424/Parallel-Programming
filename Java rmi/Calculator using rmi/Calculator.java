import java.rmi.Remote;
import java.rmi.RemoteException;


/**
 * Calculator Interface
 */

public interface Calculator extends Remote 
{
    /**
     * declaring method prototype
     */

     public int add(int x,int y) throws RemoteException;

     public int sub(int x,int y) throws RemoteException;

     public int mul(int x,int y) throws RemoteException;

     public int division(int x,int y) throws RemoteException;
}