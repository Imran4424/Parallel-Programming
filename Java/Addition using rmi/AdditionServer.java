import java.rmi.Naming;


public class AdditionServer
{
	public AdditionServer
	{
		try
		{
			Adder obj = new ImplementingAdder();

			Naming.rebind("rmi://localhost:1099/AdderService", obj);
		}
	}
}