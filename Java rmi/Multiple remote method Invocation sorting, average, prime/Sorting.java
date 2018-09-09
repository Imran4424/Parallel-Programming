import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.Remote;


/**
 * Sorting
 */
public class Sorting extends UnicastRemoteObject implements Sort
{
    public Sorting() throws RemoteException
    {
        super();

        /**
          * super keyword use to called parent constructor
          * super can be used to do more specific work like
          * 
          * super(arguments) to called parent constructor who accepts arguments
          *
          * super can also use to called parent class method that is  - super.aMethod()
          *
          * and we all know that what constructor is, constructure initialize the object values with given values
          *
          * for default constructors, the object values will be initialized with default values
          */
    }
    
    @Override
    public int[] Sorted(int[] ar, int size) throws RemoteException
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