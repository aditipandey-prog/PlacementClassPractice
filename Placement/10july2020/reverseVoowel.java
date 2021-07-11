package placementclasses;
import java.util.Scanner;
public class reverseVoowel {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	
	
    int i = 0,j = s.length()-1;
   char str[] = s.toCharArray();
   while(i<j) {
       if(!(str[i]=='a'||str[i]=='e'||str[i]=='i'||str[i]=='o'||str[i]=='u'||str[i]=='A'||str[i]=='E'||str[i]=='I'||str[i]=='O'||str[i]=='U')) {
           i++;
           continue;
       }
       
       if(!(str[j]=='a'||str[j]=='e'||str[j]=='i'||str[j]=='o'||str[j]=='u'||str[j]=='A'||str[j]=='E'||str[j]=='I'||str[j]=='O'||str[j]=='U')) {
           j--;
           continue;
       }
       
       if(i>j) break;
       
       char temp = str[i];
       str[i] = str[j];
       str[j] = temp;
       
       i++; j--;
   }
   System.out.println(new String(str));
}
}
