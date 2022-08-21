import java.util.Scanner;

public class PrintPattern {
	//public static void main(String[] args) {
	
	public void PrintPattern () {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the Number of rows in the pattern, stars in decreasing order");
		int number = sc.nextInt();
		for (int i=number; i>0; i--) 
		{
			for (int j=1; j<=i; j++) 
			{
			System.out.print("*");
			}
			if (i>1)
			System.out.println("");
		}
		//sc.close();
		}

}

