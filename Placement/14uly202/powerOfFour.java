package placementclasses;

public class powerOfFour {
public static void main(String[] args) {
	int n=64;
	int coun=0;
	 while(n>1)
     {
         if(n%4!=0)
         {    coun=1;
              break;
         }
         n=n/4;
        System.out.println("n "+n);
    }
    if(coun==1)
    	System.out.println("false");
    else
    	System.out.println("true");
  }
}
