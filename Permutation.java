import java.util.*;

class Permutation {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n<=3){
		    System.out.print("NO SOLUTION");
		    return;
		}
		for(int i=1;i<=n;i+=2){
		    System.out.print(i+" ");
		}
		for(int i=2;i<=n;i+=2){
		    System.out.print(i+" ");
		}
	}
}
