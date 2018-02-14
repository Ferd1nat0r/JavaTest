package ie.dit;

public class Tune
{
	private int x;
	
	private String title;
	private String altTitle;
	private String notation;
	
	public int getX()
	{
		return x;
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public String getAltTitle()
	{
		return altTitle;
	}
	
	public String getNotation()
	{
		return notation;
	}
	
	public String toString()
	{
		String ret = "";
		if (altTitle != null)
		{
			ret = x + title + altTitle;
		}
		else
		{
			ret = x + title;
		}
		return ret;
	}
}