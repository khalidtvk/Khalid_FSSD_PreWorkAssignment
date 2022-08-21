
import java.util.Scanner;

public class FibonacciSeries {

	//public static void main(String[] args) { 
	//can be uncommented out this to check the program specific functionality; making this public method to access within the main pgm
	
	public void FibonacciSeries () {
	Scanner sc = new Scanner (System.in); //Dont close this as we need scanner in the main program for next iteration;
	System.out.println("Enter the size of Fibonacci series");
	int number = sc.nextInt();
	int PrevSum =0;
	int Sum = 1;
	int temp;
	if (number>=2)
	System.out.print("0,1");
	if (number ==1)
		System.out.print("0");
	//3+5 = 8
	//5+8 = 13
	for (int i=2; i<number; i++) {
		temp = Sum;
		Sum = Sum +PrevSum;
		PrevSum = temp;
		System.out.print("," + Sum);	
	}	

	}
}
