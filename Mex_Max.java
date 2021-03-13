import java.util.*;
public class Mex_Max{

		public static int mex(ArrayList<Integer> a ) {

			int mex=0; 
			while(a.contains(mex))
				mex++;

			return mex;
		}

		public static int solve(ArrayList<Integer> a , int k){
			int c=0;
			if(mex(a)>Collections.max(a)) return a.size()+k;
			while(k>0) {
	
					int s=Math.round(((Collections.max(a) + mex(a))/2)); 
					if(a.contains(s)==false){
						a.add(s);
						c++;
				}
			k--;
	
			}
			return a.size() + c; 
		}


		public static void main(String args[]){

		Scanner in = new Scanner(System.in);
		ArrayList<Integer> liste = new ArrayList<Integer>();
		int t=in.nextInt() ;
		while(t>0)
		{
			int n =in.nextInt();
			int k =in.nextInt();
			for(int i=0 ; i<n ; i++) {
				int r = in.nextInt();
				liste.add(r);
			}

		System.out.println(solve(liste , k));
		t--;
		}

	}
}