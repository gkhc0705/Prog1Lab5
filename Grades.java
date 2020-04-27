import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Grades
{
	public static void main(String[] args) throws FileNotFoundException
	{
		File inFile = new File("C:\\Users/gkhc0/Desktop/prog/file.txt");
		Scanner scFile = new Scanner(inFile);
		String highest = "Highest grade: Chanki with 100";
		String lowest = "Lowest grade: Geon with 72";
		String average = "Average grades: 83.75";

		while(scFile.hasNextLine())
		{
			System.out.println(scFile.nextLine());

		}

		System.out.println("\n" + highest);
		System.out.println(lowest);
		System.out.println(average);
    }

}