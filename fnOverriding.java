import java.io.*;
class Person{
    int age;
    String name;
    public void read(){
        DataInputStream din =new DataInputStream(System.in);
        try {
            System.out.println("enter the name and age");
            name = din.readLine();
            age=Integer.parseInt(din.readLine());
        } catch (Exception e) {
            System.out.println("Error"+e);
        }

    }
    public void disp(){
        System.out.println("Name = "+name+"\tAge ="+age);
    }
}
class Teacher extends Person{
    String sub;
    public void read(){
        DataInputStream din =new DataInputStream(System.in);
        try {
            System.out.println("Enter the Subject");
            sub=din.readLine();   
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Error"+e);
        }        
    }
    public void disp(){
        System.out.println("Subject :"+sub);
    }
}
public class fnOverriding {
    public static void main(String[] args) {
        Person p;
        Teacher t;
        p=new Person();
        t=new Teacher();
        p.read();
        t.read();
        p.disp();
        t.disp();
    }
    
}