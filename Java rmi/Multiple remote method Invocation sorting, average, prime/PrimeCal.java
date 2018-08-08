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
    
    @Override
    public int[] DeteminingPrime(int[] ar, int size) throws RemoteException
    {   
        int[] prime_num = new int[size];

        int m = 1;

        for (int i = 0; i < size; i++) 
        {
            Boolean check = true;

            for(int j = 0; j < size; j++)
            {
                if(ar[j] == 0)
                {
                    continue;
                }

                if (ar[i]% ar[j] != 0 && ar[j]  != ar[i] && ar[j] != 1) 
                {
                    
                }
                else
                {
                    check = false;
                }

                if(ar[i] == 2)
                {
                    check = true;
                }
            }

            if (check) 
            {
                prime_num[m] = ar[i];
                m++;
            }

        }
        
        prime_num[0] = m-1;

        return prime_num;
    }
}