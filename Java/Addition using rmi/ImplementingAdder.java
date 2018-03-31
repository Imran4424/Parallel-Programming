import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;


public class ImplementingAdder extends UnicastRemoteObject implements Adder
{
/*	Implementations must have an explicit constructor
	in order to declare the RemoteException exception
*/

	public ImplementingAdder() throws RemoteException
	{
		super();
	}


	public int add(int x,int y) throws RemoteException
	{
		return x+y;
	}

}