import java.io.*;
import java.net.*;
import java.util.*;
/**
 * Server
 */
public class Server {
    public static void main(String[] args) {
        ServerSocket ss;
        Socket as;
        DataInputStream sin;
        DataOutputStream sout;
        Scanner s;
        try{
            String msg;
            ss= new ServerSocket(1234);
            as = ss.accept();
            sin=new DataInputStream(as.getInputStream());
            sout = new DataOutputStream(as.getOutputStream());
            s = new Scanner(System.in);
            System.out.println("\nServer\n");
            sout.writeUTF("welcome client");
            String str = sin.readUTF();
            while (!str.equals("quit")) {
                System.out.println("Friend >>\t"+str);
                System.out.print("you    >>\tenter message :");
                msg = s.nextLine();
                sout.writeUTF(msg);
                str = sin.readUTF();
            }
        }
        catch(Exception e){
            System.out.println("Error :" + e);
        }
    }
}