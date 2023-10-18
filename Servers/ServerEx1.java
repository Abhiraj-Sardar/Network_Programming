import java.io.*;
import java.net.*;
// import java.lang.*;
public class ServerEx1 
{

	public static void main(String q[]) throws IOException
		{
		System.out.println("Hello welcome....");
		ServerSocket ss=new ServerSocket(8001); //listening
		System.out.println("\nServer Running.....");
		while(true)
		{
        System.out.println("Server wait for Client Request...");
		
		Socket cs=ss.accept(); //it blocks the execution until client sends request after getting request it establishes connection
		
		DataInputStream in=new DataInputStream(cs.getInputStream());
		String msg=in.readUTF();
		System.out.println("Message From Client: " + msg);
		
		DataOutputStream out=new DataOutputStream(cs.getOutputStream());
		out.writeUTF("HI I am Server.."+"\n");
		
				
	
		}
	}
}


