import java.util.*;

class Missing {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int xor=0;
	  for(int i=1;i<=n;i++){
		  xor^=i;
    }
	  for(int i=1;i<n;i++){
		  int x=sc.nextInt();
		  xor^=x;
	  }
	  System.out.print(xor);
	}
}