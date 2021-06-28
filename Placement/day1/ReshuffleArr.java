package placementclasses;

import java.util.Scanner;

public class ReshuffleArr {
	public static void main(String[] args) {
		
	
	Scanner sc= new Scanner(System.in);
	int n = sc.nextInt();
	int [] arr=new int[n];
	for(int i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
	}
	int newArr[]=new int[n];
	int k=0,j=n/2;
	
	for(int i=0;i<n/2;i++)
	{
		newArr[k]=arr[i];
		newArr[k+1]=arr[j];
		j++;
		k=k+2;
	}
	for(int i=0;i<n;i++)
	{
		System.out.println(newArr[i]);
	}
  }
}
