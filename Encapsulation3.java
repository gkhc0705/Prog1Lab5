public class Encapsulation3
{
	private String brand;
	private int price;

	public String getBrand()
	{
		return brand;
	}

	public void setBrand(String newBrand)
	{
		brand = newBrand;
	}

	public int getPrice()
	{
		return price;
	}

	public void setPrice(int newPrice)
	{
		price = newPrice;
	}

	public String toString()
	{
		return "Brand of television: " +
		       brand +
		       "\nPrice of television " +
		       price +
		       "$";
    }

    public boolean equals(Object brand, Object price)
    {
		return (this == brand || this == price);

	}

}