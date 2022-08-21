
import java.util.Scanner;

public class CheckPrime {

	//public static void main(String[] args) {
	public void CheckPrime () {
	Scanner sc = new Scanner (System.in); //Dont close this as we need scanner in the main program for next iteration;
	System.out.println("Enter the Number to check if its a Prime number or not");
	int number = sc.nextInt();
	boolean moreThanTwoFactors=false;
	if (number ==1)
		moreThanTwoFactors= true; //to set 1 as non Prime;
	for (int i=2; i<number; i++)
	{
		int rem = number%i;
		if (rem==0)
		{
			moreThanTwoFactors = true;
			break;
		}
		
	}
		
	if (moreThanTwoFactors)
		System.out.println("Given Number is not a Prime number");
	else
		System.out.println("Given Number is a Prime number");
		
	}
}
