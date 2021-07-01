package placementclasses;
import java.util.Scanner;
public class TruncSentence {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	int k=sc.nextInt();
	int words=0,totalLen=0;
	

	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i)!=' '){
			if(words==k)
				break;
			
			totalLen++;
		}
		else
		{
			words++;
		}
	}
	System.out.println(s.substring(0,totalLen+k-1));
}
}
