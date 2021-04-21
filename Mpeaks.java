import java.util.* ; 

public class Mpeaks {
		
		public static void solve(int n,int k) {
			if(k > (n-1)/2) 
				System.out.println(-1); 

			else {
				int max = n ;
				int j = 1; 
				int flag = 1;
				while(j <= n && flag-1 != n ) {

					if(flag%2 == 0 && k>0){
						System.out.print(max+" ");
						k--;
						max--;
                    }

					else{
						System.out.print(j+" ");
						j++;
						} 
                    flag++;

				}
					System.out.println();
			}
		}  


		public static void main(String args[]) {

			Scanner in = new Scanner(System.in); 
			int t=in.nextInt(); 
			while(t > 0) {
			int n = in.nextInt(); 
			int k = in.nextInt(); 
			solve(n,k);
				t--;
			}

		}

}