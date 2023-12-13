import java.io.*;
class RowColSum{
	public static void main(String args[]) {
		int i,j;
		int r,c,sumrow;
		int sumcol[];
		int arr[][];
		DataInputStream Din;
		Din = new DataInputStream(System.in);
		try{
			System.out.println("By : MANU SANKAR U  ROLL NO:31");
			System.out.print("Enter the no of rows :");
			r=Integer.parseInt(Din.readLine());
			System.out.print("Enter the no of column :");
			c=Integer.parseInt(Din.readLine());
			arr=new int[r][c];
			sumcol=new int[c];
			for(i=0;i<r;i++){
				System.out.println("Enter the "+i+"th row elements :");
				for (j=0;j<c;j++){
					arr[i][j] = Integer.parseInt(Din.readLine());
				}
			}

			System.out.println("ARRAY ELEMENTS ARE ");
			for(i=0;i<r;i++){
				sumrow=0;
				for (j=0;j<c;j++){
					System.out.print(arr[i][j]+" ");
					sumrow=sumrow+arr[i][j];
					sumcol[j]=sumcol[j]+arr[i][j];
				}
				System.out.println("| "+sumrow);
			}
			for (int k=0;k<c;k++ ) {
				System.out.print(sumcol[k]+" ");	
			}
		}
		catch(Exception e){
			System.out.println("Error"+ e);
		}
	}
}