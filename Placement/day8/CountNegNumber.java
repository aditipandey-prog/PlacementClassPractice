import java.util.Scanner; 
public class CountNegNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int [][]mat=new int[n][n];
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			mat[i][j]=sc.nextInt();
		}
	}
	int count=0;
	for(int i=0;i<n;i++)
	{ int low=0,high=n-1,mid=0;
		while(low<=high){
			mid=(low+high)/2;
			
		    if(mat[i][mid]<0)
			{
				/*System.out.println("arr[mid] "+ mat[i][mid]+" mid "+mid+" "+i);*/
				high=mid-1;
			}
			else{
				low=mid+1;
			}
		   
		}
		count+=n-low;
		
	}
	System.out.println(count);
}
}
