import java.io.*;
import java.net.*;
public class IP_server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(9000);
        while(true){
        System.out.println("Server is Running...");
        System.out.println("Waiting for Client Query...");
        Socket cs=ss.accept();
        InetAddress ip = InetAddress.getLocalHost();//returns hostname/ip address
        DataInputStream in = new DataInputStream(cs.getInputStream());
        String msg = in.readUTF();
        System.out.println("Client : "+msg);
        DataOutputStream out = new DataOutputStream(cs.getOutputStream());
        msg=msg.toLowerCase();
        if(msg.contains("ip"))
        {
            String ipaddr=ip.getHostAddress();//returns ip address
            out.writeUTF("Server : "+"Ip Address is "+ipaddr);
        }
        else{
        if (msg.contains("name")){
            String host_name=ip.getHostName();//returns host name
            out.writeUTF("Server : "+"Host Name is "+host_name);
        }
        else{
            out.writeUTF("Server : "+"Wrong Statement...inserted!!!");
        }
            }
        System.out.println("reply Send...");

        }
        
        
    }
}
