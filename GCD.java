import java.util.Scanner;
import java.util.InputMismatchException;

public class GCD
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		double n1;
		double n2;

        try
        {
			System.out.print("Enter your second number: ");
			n1 = sc.nextDouble();
			System.out.print("Enter your second number: ");
			n2 = sc.nextDouble();
			System.out.printf("GCD: %.0f\n", findGCD(n1,n2));
		}
		catch(InputMismatchException e)
		{
			System.out.println("Please enter a number!");
		}


	}


	public static double findGCD(double n1, double n2)
	{
		if(n2 == 0)
		{
			return n1;
		}
		return findGCD(n2, n1%n2);

	}


}
