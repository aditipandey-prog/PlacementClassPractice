package placementclasses;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class IntersectionOfArrays {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int m=sc.nextInt();
	int n=sc.nextInt();
	ArrayList<Integer> al=new ArrayList<Integer>();
	for(int i=0;i<m;i++)
	{
		int k=sc.nextInt();
		al.add(k);
	}
	ArrayList<Integer> bl=new ArrayList<Integer>();
	for(int i=0;i<n;i++)
	{
		int k=sc.nextInt();
		bl.add(k);
	}
	Map<Integer,Integer>mp =new HashMap<Integer,Integer>();
	 for (int i = 0; i < n; i++)
     {
         if (mp.containsKey(bl.get(i)))
         {
        	 mp.put(bl.get(i), mp.get(bl.get(i)) + 1);;
         }
         else
         {
             mp.put(bl.get(i), 1);
         }
     }
	for(int i=0;i<m;i++)
	{
		if(mp.containsKey(al.get(i)))
		{
			System.out.println(al.get(i));
		}
	}
	
}
}
