package placementclasses;
import java.util.Scanner;
public class DecodeXOR {
 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int []encode= new int[n];
	int first=sc.nextInt();
	for(int i=0;i<n;i++)
	{
		encode[i]=sc.nextInt();
	}
	int []output= new int[n+1];
	output[0]=first;
	for(int i=0;i<n;i++)
	{
		int k=output[i]^encode[i];
		output[i+1]=k;
	}
	for(int i=0;i<n+1;i++)
	{
		System.out.println(output[i]);
	}
}
}
