package placementclasses;

import java.util.Scanner;

public class RemoveOccurence {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int n = sc.nextInt();
	int [] arr=new int[n];
	for(int i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
	}
	int k= removeKoccurence(arr);
	System.out.println("the size of array after removing k duplicate value "+ k);
}
static int removeKoccurence(int arr[])
{
	int j=arr.length-1;
	int i=0;
	while(i<j)
	{
		if(arr[i]==arr[i+1])
		{
			arr[i]=arr[j];
					j--;
		}
		else
			i++;
	}
	for(i=0;i<j+1;i++)
	{
		System.out.println(arr[i]);
	}
	return j+1;
}
}
