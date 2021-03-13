import java.util.*;
public class SplitIt {

    public static void solve(String str , int n , int k) {

        int count=0;
        int j = n;
    for( int i=0 ; i<k ; i++ ) { 

        if(str.charAt(i) == str.charAt(n - i - 1) && i<j-2 ) {
            count++;
    j--;        
        }    

    }

    if(count<k) System.out.println ("NO");
    else
     System.out.println ("Yes");
    }

    public static void main(String [] args ) {
        Scanner in =new Scanner(System.in);
        int t = in.nextInt();

        while(t>0) {

            int n=in.nextInt();
            int k=in.nextInt();
            in.nextLine();
            String str =in.nextLine() ; 
            solve(str,n,k);
            t--;
        }

    }
    

}