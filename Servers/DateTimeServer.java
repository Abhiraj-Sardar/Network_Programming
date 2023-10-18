import java.io.*;
import java.util.*;
import java.net.*; 
public class DateTimeServer {
    public static void main(String args[]) throws IOException{
        System.out.println("Hello I am Server...");
        System.out.println("Server is Running....");
        ServerSocket ss =new ServerSocket(8000);
        System.out.println("waiting for Client Response...");
        Socket cc = ss.accept();
        DataInputStream in = new DataInputStream(cc.getInputStream());
        String msg=in.readUTF();
        System.out.println("Client: "+msg);
        DataOutputStream out = new DataOutputStream(cc.getOutputStream());
        out.writeUTF("Todays Date & Time is: "+(new Date()).toString());
    }
}
