import java.util.Scanner;

public class Book
{
	private static int amountOfBooks = 0;
	private String title;
	private String authorName;
	private int isbn;
	private int pubYear;
	public String answer;

	public Book()
	{
	}

	public Book(String title, String authorName, int isbn, int pubYear)
	{
		this.title = title;
		this.authorName = authorName;
		this.isbn = isbn;
		this.pubYear = pubYear;

	}

    public void setTitle(String title)
	{
		this.title = title;
	}

	public String getTitle()
	{
		return title;
	}

	public void setAuthorName(String authorName)
	{
		this.authorName = authorName;
	}

	public String getAuthorName()
	{
		return authorName;
	}

	public void setIsbn(int isbn)
	{
		this.isbn = isbn;
	}

	public int getIsbn()
	{
		return isbn;
	}

	public void setPubYear(int pubYear)
	{
		this.pubYear = pubYear;
	}

	public int getPubYear()
	{
		return pubYear;
	}

	public String toString()
	{
		return "\nYour book title is: ";



	}

}
