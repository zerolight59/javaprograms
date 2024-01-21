import java.io.*;
class c1 {
    public static void display(){
        System.out.println("in disp of c1");
    }
}
class c2 {
    public static void display(){
        System.out.println("in disp of c2");
    }
}
public class StaticEg {
    class c1 {
        public static void display(){
            System.out.println("in disp of StaticEg class");
        }
        public static void main(String[] args) {
            display();
            c1.display();
            c2.display();
        }
       
    }
}
