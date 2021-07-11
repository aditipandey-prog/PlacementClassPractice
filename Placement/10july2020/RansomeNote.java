package placementclasses;
import java.util.Scanner;
public class RansomeNote {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String ransomNote=sc.nextLine();
	String magazine=sc.nextLine();
	boolean res=canConstruct(ransomNote,magazine);
	System.out.println(res);
}
public static boolean canConstruct(String ransomNote, String magazine) {
    int[] arr=new int[26];
    for(int i=0;i<magazine.length();i++)
    {
        arr[magazine.charAt(i)-'a']++;
    }
    for(int i=0;i<ransomNote.length();i++)
    {
        arr[ransomNote.charAt(i)-'a']--;
            if(arr[ransomNote.charAt(i)-'a']<0)
                return false;
    }
    return true;
}
}
