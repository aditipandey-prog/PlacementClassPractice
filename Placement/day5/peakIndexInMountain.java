package placementclasses;
import java.util.Scanner;
public class peakIndexInMountain {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int []arr=new int[n];
	for(int i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
	}
	int low=0;
    while(low<n)
    {
        int mid=low+(n-low)/2;
        if(arr[mid]<arr[mid+1])
            low=mid+1;
        else
            n=mid;
    }
    System.out.println(low);
}
}
