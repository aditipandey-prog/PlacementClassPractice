import java.util.ArrayList;
import java.util.Scanner;


public class Twodmatrix {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int m=sc.nextInt();
	int[][] matrix=new int[n][m];
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<m;j++)
		{ 
			int k=sc.nextInt();
			matrix[i][j]=k;
		}
	}
	ArrayList<Integer>li=new ArrayList<>();
	  for(int i=0;i<matrix.length;i++)
      {int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE,ci=0,cj=0;
          for(int j=0;j<matrix[0].length;j++)
          {
              if(matrix[i][j]<min)
              {
                min=matrix[i][j];
                ci=j;
              }
                 
         }
         for(int j=0;j<matrix.length;j++)
         {
             if(matrix[j][ci]>max)
             {
              max=matrix[j][ci];
             }
         }
      if(min==max)
    	  li.add(min);
         
      }
	  System.out.println(li);
}
}
