package placementclasses;
import java.util.Scanner;
public class missingNumber {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n=sc.nextInt();
	int []nums=new int[n];
	for(int i=0;i<n;i++)
	{
		nums[i]=sc.nextInt();
	}
     int sum=n*(n+1)/2;
     System.out.println("sum:"+sum);
     int sumArr=0;
     for(int i=0;i<n;i++)
     {
        sumArr+=nums[i];
     }
     System.out.println(sum-sumArr);
}
}
