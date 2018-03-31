import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;


public class ImplementatingAdder extends UnicastRemoteObject implements Adder
{
/*	Implementations must have an explicit constructor
	in order to declare the RemoteException exception
*/

	public ImplementatingAdder() throws RemoteException
	{
		super();
	}

}