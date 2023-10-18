import java.io.*;
import java.net.*;
public class DateTimeClient {
    public static void main(String args[]) throws IOException{
    System.out.println("Hello I am Client...");
    Socket cs = new Socket("localhost",8000);
    System.out.println("You are Connected to server!!!");
    DataOutputStream out = new DataOutputStream(cs.getOutputStream());
    out.writeUTF("Hi Server....What is Todays Date??");
    DataInputStream in = new DataInputStream(cs.getInputStream());
    String msg = in.readUTF();
    System.out.println("Server: "+msg);
    }
}
