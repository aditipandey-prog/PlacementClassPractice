package placementclasses;
import java.util.*;

public class ExtraToffies {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int []arr=new int[n];
	boolean[] brr=new boolean[n];
	for(int i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
	}
	int extraToffies=sc.nextInt();
	int max=0;
	for(int i=0;i<n;i++)
	{
		if(max<arr[i])
			max=arr[i];
	}
	for(int i=0;i<n;i++)
	{
		if((arr[i]+extraToffies)>=max)
			brr[i]=true;
		else
			brr[i]=false;
	}
	for(int i=0;i<n;i++)
	{
		System.out.print(brr[i]+" ");
	}
	
}
}
