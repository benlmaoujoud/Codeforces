import java.util.*;
public class MaxMex {

    
        // mex algorithm
        public static long  mex(Set<Long> a) {
         long   mex=0;
            while(a.contains(mex))
            mex++;

        return mex;    
        }
        // solve 
        public static void solve(Set<Long> a, int n ,int k, long max) { 
        
         long  mex = mex(a) ;
            if(mex> max  ||  k==0 ) System.out.println(n+k);
            else {  

                long  s =  (long )Math.ceil(((double)(max+mex))/2);
                    if(a.contains(s))
                        System.out.println(n) ;           
                    else    
                        System.out.println(n+1);
            } 
        }
        
    // main methode 

    public static void main(String args[]) {
    Scanner in = new Scanner(System.in) ; 
    Set<Long> a= new HashSet<Long>() ;
     int t = in.nextInt() ; 

        while(t>0) {
        int n = in.nextInt() ; 
        int k = in.nextInt();
        long max=0l;

        for (int  i=0 ; i<n ; i++) {
            long  x =in.nextLong();
            if(x>max)
            max=x;
            a.add(x);
        }
        solve(a,n,k,max); 
        a.clear();  

        t--;
        }

    }

}