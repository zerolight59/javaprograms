

import java.io.*;
import java.net.*;
import java.util.*;
/**
 * Client
 */
public class Client {
    public static void main(String[] args) {
        Socket cs;
        DataInputStream sin;
        DataOutputStream sout;
        Scanner s;
        try{
            String msg;
            cs=new Socket("localhost",1234);  
            sin=new DataInputStream(cs.getInputStream());
            sout = new DataOutputStream(cs.getOutputStream());
            s = new Scanner(System.in);
            System.out.println("\nClient\n");
            String str = sin.readUTF();
            while (!str.equals("quit")) {
                System.out.println("Friend >>\t"+str);
                System.out.print("you >>\tenter message :");   
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