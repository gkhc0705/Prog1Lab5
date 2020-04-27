public class Encapsulation2
{
	private String concept;

	public String getConcept()
	{
		return concept;
	}
	public void setConcept(String newConcept)
	{
		concept = newConcept;
	}

	public String toString()
	{
		return "Your team concept is: " +
		       concept;
	}

	public boolean equals(Object concept)
	{
		return(this == concept);
	}

}