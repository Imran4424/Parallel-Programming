import java.rmi.Naming;
import java.util.Scanner;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * Client
 */
public class Client 
{
    public static void main(String[] args) 
    {
        Scanner cin = new Scanner(System.in);

        int[] ar = new int[10];

        for (int i = 0; i < 10; i++) 
        {
            ar[i] = cin.nextInt();
        }
        
        try 
        {
            String url = "rmi://localhost/Sort";
            String url2 = "rmi://localhost/Average";
            String url3 = "rmi://localhost/Prime";

            Sort s_obj = (Sort) Naming.lookup(url);
            Average a_obj = (Average) Naming.lookup(url2);
            Prime p_obj = (Prime) Naming.lookup(url3);

            int sorted_ar[] = s_obj.Sorted(ar, 10);

            int avg = a_obj.CalculatingAverage(ar, 10);

            int prime[] = p_obj.DeteminingPrime(ar, 10);

            System.out.print("Sorted String is:");
            for (int i = 0; i < 10; i++) 
            {
                System.out.print(" " + sorted_ar[i]);
            }
            System.out.println();

            System.out.println("Average is: " + avg);

            System.out.print("Prime numbers are: ");

            for (int i = 1; i <= prime[0]; i++) {
                System.out.print(" " + prime[i]);
            }
            System.out.println();
            
        } catch (MalformedURLException malurl) {
            System.out.println();
            System.out.println("Malfromed URL Exception");
            System.out.println(malurl);

        } catch (RemoteException re) {
            System.out.println();
            System.out.println("Remote Exception");
            System.out.println(re);
        } catch (NotBoundException notbe) {
            System.out.println();
            System.out.println("Not Bound Exception");
            System.out.println(notbe);
        } catch (ArithmeticException arexc) {
            System.out.println();
            System.out.println("Arithematic Exception");
            System.out.println(arexc);
        }
    }
    
}
