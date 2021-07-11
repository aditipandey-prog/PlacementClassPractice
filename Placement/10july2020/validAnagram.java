package placementclasses;
import java.util.Scanner;
public class validAnagram {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	String t=sc.nextLine();
	boolean res=anagram(s,t);
	System.out.println(res);
}
public static boolean anagram(String s, String t) {
    int[] ar= new int[26];
    if(s.length()==t.length())
    {
        for(int i=0;i<s.length();i++)
        {
            ar[s.charAt(i)-'a']++;
        }
          for(int i=0;i<t.length();i++)
        {
            ar[t.charAt(i)-'a']--;
              if(ar[t.charAt(i)-'a']<0)
                  return false;
        }
        return true;
    }
     return false;
 }
}
