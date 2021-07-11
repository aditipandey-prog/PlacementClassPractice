package assignment;
import java.util.Scanner;
public class modulus {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	StringBuffer sb=new StringBuffer();
  //  char [] arr={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
 while(a>0){
		char c='A';
		c=(char) (c+(a-1)%26);
		sb.append(c);
		a=(a-1)/26;
	}
	System.out.println(sb.reverse());
}
}
