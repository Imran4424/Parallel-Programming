import java.rmi.Remote;

/**
 * Average
 */
public interface Average extends Remote
{

    public int[] CalculatingAverage(int[] ar);
}