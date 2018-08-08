import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * AverageCal
 */
public class AverageCal extends UnicastRemoteObject implements Average
{
    public AverageCal() throws RemoteException
    {
        super();
    }
    
    public int CalculatingAverage(int[] ar, int size) throws RemoteException
    {
        
        int sum = 0;

        for (int i = 0; i < size; i++) 
        {
            sum = sum + ar[i];
        }

        int avg = sum/size;

        return avg;
    }
}