import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.omg.CORBA.ORB;
import org.omg.CORBA.ORBPackage.InvalidName;
import org.omg.CosNaming.NameComponent;
import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHelper;
import org.omg.CosNaming.NamingContextPackage.CannotProceed;
import org.omg.CosNaming.NamingContextPackage.NotFound;
import org.omg.PortableServer.POA;
import org.omg.PortableServer.POAHelper;

import LSAApp.LSA;
import LSAApp.LSAHelper;
import LSAApp.LSAPOA;


class LSAImpl extends LSAPOA
{
	private ORB orb;
	private File inputFile;
	String[] server1 = {"1087", "1088", "sloop.cs.ship.edu"};
	String[] server2 = {"1287", "1288", "sloop.cs.ship.edu"};
	String[][] allServers = {server1, server2};
	LSA otherLSAImpl;
	boolean otherHasFile = false;
	
	public File getInputFile() 
	{
		return inputFile;
	}

	public void setORB(ORB orb_val) 
	{
		orb = orb_val;
	}
	
	
	public boolean findFile(String fileName) throws IOException, InvalidName, NotFound, CannotProceed, org.omg.CosNaming.NamingContextPackage.InvalidName
	{
		boolean fileLocal;
		if (fileLocal = hasFile(fileName))
		{
			return true;
		}
		if(fileLocal == false)
		{
			System.out.println("File not on this server.");
			for(int i=0; i < allServers.length; i++)
			{
				contactServer(i);
				if (otherHasFile == true)
				{
					storeFile(fileName);
					return true;
				}
			}
		}
		return false;
	}
	
	public boolean hasFile(String fileName)
	{
		if(fileName == null)
		{
			return false;
		}

		inputFile = new File(fileName + ".txt");
		
		if(inputFile.isFile())
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	public void storeFile(String fileName) throws IOException
	{
		String fileText = otherLSAImpl.sendFile(fileName);
		BufferedWriter writer = new BufferedWriter(new FileWriter(inputFile));
        writer.write(fileText);
        writer.close();
	}
	
	public void contactServer(int i) throws InvalidName, NotFound, CannotProceed, org.omg.CosNaming.NamingContextPackage.InvalidName, IOException
	{	
		String[] otherServer = allServers[i];
		String[] args = {"orbd", "-ORBInitialPort", otherServer[0], "-port", otherServer[1], "-ORBInitialHost", otherServer[2]};
		ORB orb = ORB.init(args, null);

		org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");

		NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);

		String name = "LSA";
		otherLSAImpl = LSAHelper.narrow(ncRef.resolve_str(name));
		otherHasFile = otherLSAImpl.hasFile(inputFile.getName());
	}
	
	public String getRecord(int recordNum) throws IOException
	{
		int startingPlace = ((recordNum-1) * 10);
		String record = new String();
		
		BufferedReader reader = new BufferedReader(new FileReader(inputFile));
		
		reader.skip(startingPlace);
		for(int start = startingPlace; start < (startingPlace + 8); start++)
		{
			int c = (reader.read());
			if (c == -1)
			{
				reader.close();
				System.out.println("No existing record");
				return null;
			}
			record = record + (char)(c);
		} 
		System.out.println(record);

		reader.close();
		return record;
		
	}
	
	public String sendFile(String fileName) throws IOException
	{
		String file = new String();
		String temp = new String();
		
		BufferedReader reader = new BufferedReader(new FileReader(fileName));
		while((temp = reader.readLine())!= null)
		{
			file = file + temp;
		}
		
		reader.close();
		return file;
	}
}

public class LSAServer 
{
	public static void main(String args[])
	{
		try{
			// create and initialize the ORB
			ORB orb = ORB.init(args, null);

			// get reference to rootpoa & activate the POAManager
			POA rootpoa = POAHelper.narrow(orb.resolve_initial_references("RootPOA"));
			rootpoa.the_POAManager().activate();

			// create servant and register it with the ORB
			LSAImpl LSAImpl = new LSAImpl();
			LSAImpl.setORB(orb); 

			// get object reference from the servant
			org.omg.CORBA.Object ref = rootpoa.servant_to_reference(LSAImpl);
			LSA href = LSAHelper.narrow(ref);

			// get the root naming context
			org.omg.CORBA.Object objRef =
			orb.resolve_initial_references("NameService");
			// Use NamingContextExt which is part of the Interoperable
			// Naming Service (INS) specification.
			NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);

			// bind the Object Reference in Naming
			String name = "LSA";
			NameComponent path[] = ncRef.to_name( name );
			ncRef.rebind(path, href);

			while(true)
			{
				System.out.println("LSAServer ready and waiting ...");

				// wait for invocations from clients
				orb.run();   
			}
		}
		catch (Exception e) {
			System.err.println("ERROR: " + e);
			e.printStackTrace(System.out);
		}
	}
}
