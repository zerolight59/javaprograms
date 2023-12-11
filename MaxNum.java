import java.
class MaxNum{
	public static void main(String[] args) {
		int a,b,c;
		DataInputStream Din;
		Din = new DataInputStream(System.in);
		try{
			System.out.println("By : MANU SANKAR U  ROLL NO:31");
			System.out.println("Enter the first number :");
			a=Integer.parseInt(Din.readLine());
			System.out.println("Enter the Secound number :");
			b=Integer.parseInt(Din.readLine());
			System.out.println("Enter the third number :");
			c=Integer.parseInt(Din.readLine());
			if(a>b){
				if(a>c)
					System.out.println("max = "+a);
				else
					System.out.println("max = "+c);	
			}
			else{
				if(b>c)
					System.out.println("max = "+b);
				else
					System.out.println("max = "+c);	
			}
		}
		catch(Exception e){
			System.out.println("Error"+ e);
		}
	}
}