import java.rmi.Naming;
import java.rmi.RemoteException;
import java.net.MalformedURLException;
import java.rmi.NotBoundException;


public class AdditionClient
{
	public static void main(String[] args) 
	{
		int  x = Integer.parseInt(args[0]);
		int  y = Integer.parseInt(args[1]);

		try
		{
			Adder obj = (Adder) Naming.lookup("rmi://localhost/AdderService");
			
			System.out.println( "The addition of "+ x +" and "+ y +"is: "+ obj.add(x, y) );
		
		}
	}
}