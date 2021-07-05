package placementclasses;
import java.util.Scanner;
public class SameElementsinDiagonals {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int m=sc.nextInt();
	int[][]arr=new int[n][m];
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<m;j++)
		{
			arr[i][j]=sc.nextInt();
		}
	}
	int flag=0;
    for(int i=0;i<arr.length;i++)
    { 
        for(int j=0;j<arr[0].length;j++)
        {   flag=0;
            if(i+1<arr.length && j+1<arr[0].length && arr[i][j]!=arr[i+1][j+1] )
            {
                flag=1;
                System.out.println("Not a Special Matrix");
                System.exit(0);
            }
        }
       
    }
     if(flag==0)
    	 System.out.println("Special Matrix");
       
}
}
