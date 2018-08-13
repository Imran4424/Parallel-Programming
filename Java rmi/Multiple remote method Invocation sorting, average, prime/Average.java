import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Average
 */
public interface Average extends Remote
{

    public int CalculatingAverage(int[] ar, int size) throws RemoteException;
}