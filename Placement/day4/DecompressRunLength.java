package placementclasses;
import java.util.Scanner;
import java.util.ArrayList;

public class DecompressRunLength {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int []nums=new int[n];
	for(int i=0;i<n;i++)
	{
		nums[i]=sc.nextInt();
	}
	 ArrayList<Integer> arr= new ArrayList<>();
     
     for(int i=0;i<nums.length;i+=2)
     {
         for(int j=0;j<nums[i];j++)
         {
             arr.add(nums[i+1]);
         }
     }
     int brr[]=new int[arr.size()];
     for (int i = 0; i < arr.size(); i++)
         brr[i] = arr.get(i);
     for(int i=0;i<arr.size();i++)
 	{
 		System.out.println(brr[i]);
 	}
}
}
