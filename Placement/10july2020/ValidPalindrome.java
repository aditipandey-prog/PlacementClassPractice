package placementclasses;
import java.util.Scanner;

public class ValidPalindrome {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	  int l=0,r=s.length()-1,flag=0;
	  s=s.toLowerCase();
    for(int i=0;i<s.length();i++,r--,l++)
      { 
        while(l<r && !Character.isLetterOrDigit(s.charAt(l)) )
        {
        	l++;
        }
            
        
        while(l<r && !Character.isLetterOrDigit(s.charAt(r)) )
        {
        	   r--;
        }
        if(r<=l)
        	break;
        if(s.charAt(l)!=s.charAt(r))
        { flag=1;
        	System.out.println("false");
        	break;
        }
       
      }
    if(flag==0)
      System.out.println("true");
    
	
}
}
