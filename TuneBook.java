package ie.dit;
import java.io.IOException;
import java.io.FileReader;
import java.util.ArrayList;
import java.io.BufferedReader;

public class TuneBook
{
	ArrayList<String> tunes = new ArrayList<String>();
	
	BufferedReader inputStream<String> = null;
	try {
		inputStream<String> = new BufferedReader(new FileReader("hmj0.abc"));
    
		String l;
		while ((l = inputStream.readLine()) != null) 
		{
			System.out.println(l);
		}
	}
	catch (IOException e)
	{
		e.printStackTrace();
	} 
	finally 
	{
		if (inputStream != null) {
			try
			{
				inputStream.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}    
}
