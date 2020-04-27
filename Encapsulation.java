public class Encapsulation
{
	private String name;
	private int grades;

	public int getGrades()
	{
		return grades;
	}

	public void setGrades(int newGrades)
	{
		grades = newGrades;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String newName)
	{
		name = newName;
	}

	public String toString()
	{
		return "Your name is: " +
		       name +
		       "\nYour grade is: " +
		       grades;
    }

    public boolean equals(Object name)
    {

	    return (this == name);

	}


}