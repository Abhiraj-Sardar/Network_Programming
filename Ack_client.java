
import java.io.*;
import java.net.*;
public class Ack_client {
    public static void main(String[] args) throws IOException {
        Socket cs = new Socket("localhost",8082);
        System.out.println("Client is Running...");
        DataOutputStream out = new DataOutputStream(cs.getOutputStream());
        out.writeUTF("Hello I am Client!!");
        System.out.println("Waiting for Server Acknowledgement...");
        DataInputStream in = new DataInputStream(cs.getInputStream());
        String msg = in.readUTF();
        System.out.println("server : "+msg);
    }
}
