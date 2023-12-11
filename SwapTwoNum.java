import java.io.*;
class SwapTwoNum{
	public static void main(String[] args) {
		int a,b;
		DataInputStream Din;
		Din = new DataInputStream(System.in);
		try{
			System.out.println("By : MANU SANKAR U  ROLL NO:31");
			System.out.println("Enter the first number :");
			a=Integer.parseInt(Din.readLine());
			System.out.println("Enter the Secound number :");
			b=Integer.parseInt(Din.readLine());
			System.out.println("BEFORE SWAP");
			System.out.println("a = "+a);
			System.out.println("b = "+b);
			System.out.println("AFTER SWAP");
			a=a^b;
			b=a^b;
			a=a^b;
			System.out.println("a = "+a);
			System.out.println("b = "+b);
		}
		catch(Exception e){
			System.out.println("Error"+ e);
		}
	}
}