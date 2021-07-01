package placementclasses;
import java.util.Scanner;
public class ShuffleString {
	public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
		  int n= sc.nextInt();
		  int[] indices=new int[n];
		  for(int i=0;i<n;i++)
		  {
			  indices[i]=sc.nextInt();
		  }
		  String s= sc.next();
		  char []ans= new char[n];
		  for(int i=0;i<indices.length;i++)
	        {
	          ans[indices[i]]=s.charAt(i);
	        }
	        String res=new String(ans);
	        System.out.println(res);
	}
}
