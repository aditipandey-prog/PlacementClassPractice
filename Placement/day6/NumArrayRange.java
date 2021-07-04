package placementclasses;
import java.util.Scanner;
public class NumArrayRange {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int[] arr=new int[n];
	for(int i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
	}
	System.out.println("Left:");
	int left=sc.nextInt();
	System.out.println("Right:");
	int right=sc.nextInt();
	int[] sum=new int[n+1];
	for(int i=0;i<n;i++)
	{
		sum[i+1]=sum[i]+arr[i];
	}
	System.out.println(sum[right+1]-sum[left]);
}
}
