package placementclasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class binaryWatch {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int turnedOn=sc.nextInt();
	List<String> al=new ArrayList<>();
	for(int i=0;i<12;i++)
	{
		for(int j=0;j<60;j++)
		{
	         if(hdistance(i)+hdistance(j)==turnedOn){
	        	 al.add(String.format("%d:%02d",i,j));
	         }
	   }
	}
	System.out.println(al);
}
public static int hdistance(int num){
	int ans=0;
	while(num!=0)
	{
		ans++;
		num=num&(num-1);
	}
	return ans;
    }
}

