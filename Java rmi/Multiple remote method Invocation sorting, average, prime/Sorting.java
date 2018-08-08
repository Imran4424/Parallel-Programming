import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import com.sun.org.apache.bcel.internal.generic.SWAP;

/**
 * Sorting
 */
public class Sorting extends UnicastRemoteObject implements Sort
{
    public Sorting() throws RemoteException
    {
        super();
    }
    
    @Override
    public int[] Sorted(int[] ar, int size) 
    {

        for (int i = 0; i < size - 1; i++) 
        {
            for(int j = 0; j < size-1-i; j++)
            {
                if (ar[j] > ar[j+1]) 
                {
                    int temp = ar[j];
                    ar[j] = ar[j+1];
                    ar[j+1] = temp;    
                }
            }   
        }

        return ar;
    }
}