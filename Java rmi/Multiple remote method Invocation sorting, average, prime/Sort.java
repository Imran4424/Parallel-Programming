import java.rmi.Remote;

/**
 * Sort
 */
public interface Sort extends Remote
{
    /**
     * Declaring method prototype
    */

    public int[] Sorted(int[] ar, int size);
    
}