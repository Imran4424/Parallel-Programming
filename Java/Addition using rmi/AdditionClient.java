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
			
			System.out.println( "The addition of "+ x +" and "+ y +" is: "+ obj.add(x, y) );
		
		}
		catch (MalformedURLException murle) 
		{
			System.out.println();
			System.out.println("MalformedURLException");
			System.out.println(murle);
		}
		catch (RemoteException re) {
			System.out.println();
			System.out.println("RemoteException");
			System.out.println(re);
		}
		catch (NotBoundException nbe) {
			System.out.println();
			System.out.println("NotBoundException");
			System.out.println(nbe);
		}
		catch (java.lang.ArithmeticException ae) {
			System.out.println();
			System.out.println("java.lang.ArithmeticException");
			System.out.println(ae);
		}
	}
}