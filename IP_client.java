import java.net.*;
import java.io.*;
public class IP_client {
    public static void main(String[] args) throws IOException{
        Socket cs = new Socket("localhost",9000);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Client is Running...");
        System.out.println("Enter Your Message here:");
        String msg = br.readLine();
        DataOutputStream out = new DataOutputStream(cs.getOutputStream());
        out.writeUTF(msg);
        DataInputStream in = new DataInputStream(cs.getInputStream());
        String reply = in.readUTF();
        System.out.println(reply);        
    }
}
