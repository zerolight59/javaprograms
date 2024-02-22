import java.net.*;
import java.io.*;

public class UCDemoSave {
    public static void main(String[] args) throws Exception {
        int c;
        URL u = new URL(args[0]);
        URLConnection uc =u.openConnection();
        int len =uc.getContentLength();
        System.out.println( "The length of the content is "+len);
        if (len>0) {
            FileOutputStream fout=new FileOutputStream("test.pdf");
            InputStream input =uc.getInputStream();
            int i=0;
            while (((c=input.read())!=-1)&&i<len) {
                fout.write((char)c);
                i++;
            }
            input.close();
            fout.close();
        }
        else{
            System.out.println("no content avilable");
        }
    }
}
