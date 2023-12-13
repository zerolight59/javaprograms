import java.io.*;
class SearchEle{
	public static void main(String args[]) {
		int n,e,flag=0;
		int arr[];
		DataInputStream Din;
		Din = new DataInputStream(System.in);
		try{
			System.out.println("By : MANU SANKAR U  ROLL NO:31");
			System.out.print("Enter the no of elements :");
			n=Integer.parseInt(Din.readLine());
			arr =new int[n];
			System.out.println("Enter the array elements :");
			for(int i=0;i<n;i++){
				arr[i]=Integer.parseInt(Din.readLine());
			}
			System.out.print("Enter the elements to search :");
			e=Integer.parseInt(Din.readLine());
			for(int i=0;i<n;i++){
				if(arr[i]==e){
					flag=i;
				}
			}
			
			if(flag!=0){
				System.out.println("Elements found at position "+(flag+1));
			}
			else{
				System.out.println("Elements not found");
			}
		
		}
		catch(Exception err){
			System.out.printf("Error :"+ err);
		}

	}
}