import java.io.*;
class FinallyEg {
    public static void main(String[] args) {
        int a,b,c;
        DataInputStream din=new DataInputStream(System.in);
        String s;
        try {
            System.out.println("Enter number 1:");
            s=din.readLine();
            a=Integer.parseInt(s);
            System.out.println("Enter number 2:");
            s=din.readLine();
            b=Integer.parseInt(s);
            c=a/b;
            System.out.println("c ="+c);
        } 
        catch(Exception e){
            System.out.println("Error" + e);
        }
        finally{
            System.out.println("IN the finally block");
        }
    }
}
