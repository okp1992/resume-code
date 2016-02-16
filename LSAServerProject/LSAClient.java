import java.util.Scanner;

import org.omg.CORBA.ORB;
import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHelper;

import LSAApp.LSA;
import LSAApp.LSAHelper;

//-ORBInitialPort 1087 -port 1088 -ORBInitialHost sloop.cs.ship.edu
public class LSAClient 
{
	static LSA LSAImpl;

	public static void main(String args[])
	{
		try
		{
			ORB orb = ORB.init(args, null);

			org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");

			NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);

			String name = "LSA";
			LSAImpl = LSAHelper.narrow(ncRef.resolve_str(name));

			System.out.println("Obtained a handle on server object");
			System.out.println("Enter a file name: ");
			Scanner scan1 = new Scanner(System.in);
			String file = scan1.next();
			if (LSAImpl.findFile(file))
			{
				System.out.println("Input line number of desired record: ");
				
				String record = scan1.next();
				
				System.out.println(LSAImpl.getRecord(Integer.parseInt(record)));
				
				scan1.close();
			}
			else
			{
				System.out.println("File does not exist on any server.");
			}
		}
		catch (Exception e)
		{
			System.out.println("ERROR : " + e) ;
			e.printStackTrace(System.out);
		}
	}
}
