import java.util.Scanner;

public class PalindromeCheck {

	//public static void main(String[] args) {
	public void PalindromeCheck () {

	Scanner sc = new Scanner (System.in);
	System.out.println("Enter the Number to check if its a Palindrome or not");
	int number = sc.nextInt();
	int temp=number;
	int reverseNumber=0;
	while (number>0) {
		int reminder = number%10;
		reverseNumber = reminder + (10*reverseNumber);
		number = number/10;
	}
		
	if (reverseNumber==temp)
		System.out.println("Given Number is a Palindrome");
	else
		System.out.println("Given Number is not a Palindrome");
		
	}
}
