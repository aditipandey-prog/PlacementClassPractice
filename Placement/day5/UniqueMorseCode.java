package placementclasses;
import java.util.Iterator;
import java.util.Scanner;
import java.util.HashMap;
import java.util.HashSet;
public class UniqueMorseCode {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int n= sc.nextInt();
	String [] words= new String[n];
	for(int i=0;i<n;i++)
	{
		words[i]=sc.nextLine();
	}
	  HashMap<Character,String>hm=new HashMap<Character,String>();
      HashSet<String> h = new HashSet<String>();
      hm.put('a',".-");
      hm.put('b',"-...");
      hm.put('c',"-.-.");
      hm.put('d',"-..");
      hm.put('e',".");
      hm.put('f',"..-.");
      hm.put('g',"--.");
      hm.put('h',"....");
      hm.put('i',"..");
      hm.put('j',".---");
      hm.put('k',"-.-");
      hm.put('l',".-..");
      hm.put('m',"--");
      hm.put('n',"-.");
      hm.put('o',"---");
      hm.put('p',".--.");
      hm.put('q',"--.-");
      hm.put('r',".-.");
      hm.put('s',"...");
      hm.put('t',"-");
      hm.put('u',"..-");
      hm.put('v',"...-");
      hm.put('w',".--");
      hm.put('x',"-..-");
      hm.put('y',"-.--");
      hm.put('z',"--..");
      for(String s:words)
      {   String str=new String();
      char[] chars = s.toCharArray();
          for(char ch:chars)
          {
              if(hm.containsKey(ch))
                   str=str.concat(hm.get(ch));
          }
          h.add(str);
      }
      /*Iterator<String> i = h.iterator();
      while (i.hasNext())
          System.out.println(i.next());*/
      System.out.println(h.size()-1);
}
}
