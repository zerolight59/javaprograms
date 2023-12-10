import java.io.*;
class TwoNumSum{
	public static void main(String args[]){
		int a,b;
		DataInputStream Din;
		Din = new DataInputStream(System.in);
		try{
			System.out.println("By : MANU SANKAR U  ROLL NO:31");
			System.out.println("Enter the first number :");
			a=Integer.parseInt(Din.readLine());
			System.out.println("Enter the Secound number :");
			b=Integer.parseInt(Din.readLine());
			System.out.println("Sum of "+ a +" and " + b +" is "+(a+b));
		}
		catch(Exception e){
			System.out.println("Error"+ e);
		}
	}
}