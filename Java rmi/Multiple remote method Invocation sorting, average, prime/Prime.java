import java.rmi.Remote;

/**
 * Prime
 */
public interface Prime extends Remote
{

    public int[] DeteminingPrime(int[] ar);    
}