package placementclasses;
import java.util.Scanner;
public class projectionArea {
public static void main(String[] args) {
	 int count=0;
	 Scanner sc=new Scanner(System.in);
	 int n=sc.nextInt();
	 int[][] grid=new int[n][n];
	 for(int i=0;i<n;i++)
	 {
		 for(int j=0;j<n;j++)
		 {
			 grid[i][j]=sc.nextInt();
		 }
	 }
     for(int i=0;i<grid.length;i++)
     {
         for(int j=0;j<grid.length;j++)
         {
            if(grid[i][j]!=0)
                count++;
         }  
     }
     int max=0,maxcol=0;
     for(int i=0;i<grid.length;i++)
     { max=grid[i][0];
      maxcol=grid[0][i];
         for(int j=0;j<grid.length;j++)
         {
             max=Math.max(max,grid[i][j]);
             maxcol=Math.max(maxcol,grid[j][i]);
         }
      count=count+max+maxcol;
     }
     System.out.println(count);
}
}
