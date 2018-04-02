import java.rmi.Remote;
import java.rmi.RemoteException

public interface Adder extends Remote
{
	//declaring the method prototype

	public int add(int x,int y) throws RemoteException;
}