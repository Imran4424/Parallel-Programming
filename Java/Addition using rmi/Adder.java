import java.rmi.Remote;

public interface Adder extends Remote
{
	//declaring the method prototype

	public int add(int x,int y)

	throws java.rmi.RemoteException;
}