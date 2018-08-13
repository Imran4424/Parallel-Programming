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
        int[] prime_num = new int[size + 1];

        int m = 1;

        Boolean check = true;

        for (int i = 0; i < size; i++) 
        {
            check = true;

            for(int j = 0; j < size; j++)
            {
                if(ar[j] == 0)
                {
                    continue;
                }

                if(ar[i] == 0 || ar[i] == 1)
                {
                    check = false;
                    j = size;
                    continue;
                }

                if(ar[i]%2 == 0 && ar[i] != 2)
                {
                    check = false;
                    j = size;
                    continue;
                }
                else if(ar[i] % 3 == 0 && ar[i] != 3)
                {
                    check = false;
                    j = size;
                    continue;
                }
                else if(ar[i] % 5 == 0 && ar[i] != 5)
                {
                    check = false;
                    j = size;
                    continue;
                }
                else if(ar[i] % 7 == 0 && ar[i] != 7)
                {
                    check = false;
                    j = size;
                    continue;
                } 
                else if (ar[i] % ar[j] == 0 && (ar[j] == ar[i] || ar[j] == 1)) 
                {
                    check = true;
                    j = size;
                    continue;
                }
                else
                {
                    check = false;
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