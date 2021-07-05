package placementclasses;
import java.util.Scanner;
public class TransposeMatrix {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int n=sc.nextInt();
	int m=sc.nextInt();
	int [][] arr=new int[n][m];
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<m;j++)
		{
			arr[i][j]=sc.nextInt();
		}
	}
	  int [][] b=new int[arr[0].length][arr.length];
      for(int i=0;i<arr.length;i++)
      {
          for(int j=0;j<arr[0].length;j++)
          {
              b[j][i]=arr[i][j];
          }
      }
	for(int i=0;i<m;i++)
	{
		for(int j=0;j<n;j++)
		{
			System.out.print(b[i][j]+" ");
		}
		System.out.println();
	}
}
}
