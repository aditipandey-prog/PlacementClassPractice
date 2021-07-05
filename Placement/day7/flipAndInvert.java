package placementclasses;
import java .util.Scanner;
public class flipAndInvert {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[][] image=new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				image[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<n;i++)
        {
            for(int j=0;j<n/2;j++)
            {
                int temp=image[i][j];
                image[i][j]=image[i][n-j-1];
                image[i][n-j-1]=temp;
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(image[i][j]==1)
                    image[i][j]=0;
                else
                    image[i][j]=1;
            }
        }
        for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.println(image[i][j]);
			}
		}

	}

}
