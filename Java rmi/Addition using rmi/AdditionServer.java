import java.rmi.Naming;


public class AdditionServer
{
	public AdditionServer()
	{
		try
		{
			Adder obj = new ImplementingAdder();

			Naming.rebind("rmi://localhost:1099/AdderService", obj);
		}
		catch(Exception e)
		{
			System.out.println("Trouble: " + e);
		}
	}

	public static void main(String[] args) 
	{
		new AdditionServer();
	}
}