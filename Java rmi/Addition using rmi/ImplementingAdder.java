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


	public int add(int x,int y) throws RemoteException
	{
		return x+y;
	}

}