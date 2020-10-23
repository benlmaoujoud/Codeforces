import java.util.Scanner;
public class Watermelon {

	public static void main(String[] args) {
		int n;
		Scanner input = new Scanner(System.in);

		n=input.nextInt();
		// we have to check if w is even and greather then 2 (because 2 =1+1)
		if(w%2 == 0 && w > 2) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		     }
		
	}

}
