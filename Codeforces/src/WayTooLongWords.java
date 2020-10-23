import java.util.Scanner;

public class WayTooLongWords {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int n;
        n=input.nextInt();
	// n is the number of words 
        String[] words=new String[n+1];
        for(int i=0;i<n+1;i++)
        {
            words[i]=input.nextLine();
        }
        for(int i=0;i<n+1;i++)
        {
            if(words[i.length()>10)
            {
		//charAt() is an inbuilt method which can read a string letter by letter
		// for exemple let words="Hello" , then words.charAt(0)="H"
                System.out.print(words[i].charAt(0));
                System.out.print(words[i].length()-2);
                System.out.print(words[i].charAt(words[i].length()-1));
            }
	// we must just to print the word if wordlngth<10
		System.out.println(word[i]);

            System.out.print("\n");
        }
    }
}
