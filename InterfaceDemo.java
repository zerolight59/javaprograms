import java.io.*;
interface ill{
    public void disp();
    public void print();
}
class cl implements ill{
    public void disp(){
        System.out.println("Interface disp");
    }
    public void print(){
        System.out.println("Interface print");
    }
    public void draw(){
        System.out.println("Draw not in Interface");
    }
}
class InterfaceDemo{
    public static void main(String[] args) {
        cl obj =new cl();
        obj.disp();
        obj.print();
        obj.draw();
    }
}