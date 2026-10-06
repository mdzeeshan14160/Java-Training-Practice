import java.util.*;

public class IncrArr {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      long[] a=new long[n];
      for(int i=0;i<n;i++){
        a[i]=sc.nextLong();
      }
      int curr=1,prev=0;
	  long ope=0;
      while(curr<n){
        if(a[curr] < a[prev]){
          long curr_oper=Math.abs(a[curr]-a[prev]);
          a[curr] += curr_oper;
          ope += curr_oper;
          prev=curr;
          curr++;
        }else{
          curr++;
          prev++;
        }
      }
      System.out.println(ope);
    }
}