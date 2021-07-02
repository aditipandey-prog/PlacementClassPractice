package placementclasses;
import java.util.Scanner;
public class subsetXORSum {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int n= sc.nextInt();
	int[] nums= new int[n];
	for(int i=0;i<n;i++)
	{
		nums[i]=sc.nextInt();
	}
	int sum=sol(nums,0,0);
	System.out.println(sum);
}
public static int sol(int nums[],int i,int sum)
{
	if(i==nums.length)
        return sum;
    else if(nums.length==0)
        return 0;
    else
     return sol(nums,i+1,sum^nums[i])+sol(nums,i+1,sum);
}
}
