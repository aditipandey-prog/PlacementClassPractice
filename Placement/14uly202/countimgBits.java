package placementclasses;

import java.util.ArrayList;
import java.util.Scanner;

public class countimgBits {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int n=sc.nextInt();
	
	 ArrayList<Integer> bal=new ArrayList<>();
     for(int i=0;i<=n;i++)
     {
         int count=countSetBits(i);
         bal.add(count);
     }
     int [] res= new int[bal.size()];
     for(int i=0;i<bal.size();i++)
     {
         res[i]=bal.get(i);
     }
     for(int i=0;i<bal.size();i++)
     {
         System.out.println(res[i]);
     }
  
 }
 public static int countSetBits(int n)
 {
     int count = 0;
     while (n > 0) {
         count += n & 1;
         n >>= 1;
     }
     return count;
 }
}

