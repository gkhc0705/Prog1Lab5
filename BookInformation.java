import java.util.Scanner;

public class BookInformation
{
	private static final String publisher = "Publisher: Vanier";

	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		Book book = new Book();

		System.out.print("Enter book title: ");
		String title = kb.nextLine();
        book.setTitle(title);

        System.out.print("Enter author name: ");
        String authorName = kb.nextLine();
        book.setAuthorName(authorName);

        System.out.print("Enter ISBN of the book: ");
        int isbn = kb.nextInt();
        book.setIsbn(isbn);

        System.out.print("Enter the year published (MM/DD/YYYY): ");
        int pubYear = kb.nextInt();
        book.setPubYear(pubYear);
        int pubYear2 = book.getPubYear();

        int amountOfBooks = 1;

		System.out.println(book.toString() + book.getTitle());
		System.out.println("The author name is: " + book.getAuthorName());
		System.out.println("The ISBN of your book is: " + book.getIsbn());
		System.out.println("The year published is: " + pubYear2);
	    System.out.println(publisher);
	    System.out.println("\nYou have searched " + amountOfBooks + " book(s)");



		Scanner sc = new Scanner(System.in);
		System.out.print("Would you like to search for another book? Y/N ");
		String answer = sc.nextLine();


		while(answer.equals("Y"))
		{
			System.out.print("\nEnter book title: ");
		    title = kb.next();
			book.setTitle(title);

		    System.out.print("Enter author name: ");
			authorName = kb.next();
	        book.setAuthorName(authorName);

	        System.out.print("Enter ISBN of the book: ");
	        isbn = kb.nextInt();
	        book.setIsbn(isbn);

	        System.out.print("Enter the year published (MM/DD/YYYY): ");
	        pubYear = kb.nextInt();
	        book.setPubYear(pubYear);
            pubYear2 = book.getPubYear();

            System.out.println(book.toString() + book.getTitle());
			System.out.println("The author name is: " + book.getAuthorName());
			System.out.println("The ISBN of your book is: " + book.getIsbn());
		    System.out.println("The year published is: " + pubYear2);

		    amountOfBooks++;
		    System.out.println("\nYou have searched " + amountOfBooks + " book(s)");

            System.out.print("\nWould you like to search for another book? Y/N ");
		    answer = sc.nextLine();

		}

		if(answer.equals("N"))
		{
			System.out.println("Good bye!");
		}


	}
}