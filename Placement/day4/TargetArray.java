package placementclasses;
import java.util.Scanner;
import java.util.ArrayList;
public class TargetArray {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int []index=new int[n];
	int[] nums=new int[n];
	for(int i=0;i<n;i++)
	{
		index[i]=sc.nextInt();
	}
	for(int i=0;i<n;i++)
	{
		nums[i]=sc.nextInt();
	}
	  ArrayList<Integer> al=new ArrayList<>();
      for(int i=0;i<index.length;i++)
      {
          al.add(index[i],nums[i]);
      }
      int[] arr=new int[al.size()];
      for(int i=0;i<al.size();i++)
      {
          arr[i]=al.get(i);
      }
      for(int i=0;i<al.size();i++)
      {
          System.out.println(arr[i]);
      }
}
}
