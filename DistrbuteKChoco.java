import java.util.*;

public class DistrbuteKChoco {
    public static void main(String[] args) {

        int n = 5;
        int k = 3;

        // Write your logic here
        int c=0;
        for(int i=0;i<=k;i++){
          for(int j=0;j<=k;j++){
            int x=n-i-j;
              if(i+j+x==n && x<=k && x>=0){
                System.out.println(i+" "+j+" "+x);
                c++;
              }
            
          }
        }
        System.out.print(c);
    }
}