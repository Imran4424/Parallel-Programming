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