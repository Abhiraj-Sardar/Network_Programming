import java.io.*;
import java.net.*;
public class Ack_server{
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(8082);
        System.out.println("Server is Running...");
        System.out.println("Waiting for Client...");
        Socket sc = ss.accept();

        DataInputStream in = new DataInputStream(sc.getInputStream());
        String msg = in.readUTF();
        System.out.println("Message Successfully Received...");
        System.out.println("Client : "+msg);
       
        DataOutputStream out = new DataOutputStream(sc.getOutputStream());
        out.writeUTF("Message Received Successfully...");
        System.out.println("Acknowledgement is Send to Client...");

    }
}