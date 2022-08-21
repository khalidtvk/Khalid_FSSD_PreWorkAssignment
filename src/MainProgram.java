import java.util.Scanner;

public class MainProgram {
public static void main(String[] args) {
	
	Scanner sc = new Scanner (System.in);
	int choice;
	do {
		System.out.println("");
		System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n" 
				+ "2. Print Triangle Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"
				+ "4. Enter the count for Fibonacci series. \n");
		 choice = sc.nextInt();
		switch(choice) {
		case 0:
			break;
		case 1:
		{
			PalindromeCheck pc = new PalindromeCheck ();
			pc.PalindromeCheck();
			break;
		}
		case 2:
		{
			PrintPattern st = new PrintPattern();

			st.PrintPattern();
			break;
		}
		case 3:
			
			CheckPrime cp = new CheckPrime ();
			cp.CheckPrime();
			break;
		case 4:
			FibonacciSeries fs = new FibonacciSeries ();
			fs.FibonacciSeries();
			
			break;
			
				
		}
	} while(choice !=0);
	System.out.println("Thank You! You have exited successfully");
	sc.close();
	
	}
}
