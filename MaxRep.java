import java.util.*;

public class MaxRep {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      String s=sc.next();
      int max=0,count=1;
      for(int i=1;i<s.length();i++){
        if(s.charAt(i-1)==s.charAt(i)){
          count++;
        }else{
          max=Math.max(count,max);
          count=1;
        }
		max=Math.max(max,count);
      }
	  int res=(s.length()==1)? 1 : max;
      System.out.println(res);
    }
}