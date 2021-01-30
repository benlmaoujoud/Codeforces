import java.util.*;
public class Kdivisble {
	public static int kdivise(int n , int k ) {

		if( n==1 || k==1 ) return k;
		if(n%k==0 ) return 1;

		if( n<k ){
			int x= k/n;
			if(k%n!=0) ++x;

			return x; 
		}
		if(k<n) {
		 return 2 ;

		}
		return 0 ;

	}
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int n,k,res;
		int t = in.nextInt() ;
		while(t>0)
		{
			n=in.nextInt();
			k=in.nextInt();
			res = kdivise(n,k);
			System.out.println(res);
			t--;
		}




	}
}