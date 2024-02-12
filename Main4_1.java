import java.io.*;

class MThread extends Thread{
    public void run(){
        Odd o;
        Even e;
        for (int i = 1; i <= 100; i++) {
            if (i%2==0) {
                e= new Even(i);
                e.start();
            }
            else{
                o= new Odd(i);
                o.start();
            }
        }
    }
}

class Odd extends Thread{
    int num;
    public Odd(int n){
        this.num= n;
    }
    public void run(){
        System.out.println("odd : "+num);
    }
}

class Even extends Thread{
    int num;
    public Even(int n){
        this.num= n;
    }
    public void run(){
        System.out.println("Even : "+num);
    }
}
/**
 * Main4_1
 */
public class Main4_1 {
    public static void main(String[] args) {
            MThread mt =new MThread();
            mt.start();
   }
    
}