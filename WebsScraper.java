import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;

public class WebsScraper
{
	String thing;
	ArrayList<String> city = new ArrayList<String>();
	ArrayList<Integer> hardness = new ArrayList<Integer>();
	public WebsScraper() throws IOException
	{
		String[] search = new String[] {"Akron", "Chillicothe", "Cincinnati", "Cleveland", "Columbus", "Dayton", "Deleware", "Elyra", "Grove City", "Hamilton", "Hilliard", "Lancaster", "Loveland", "Mason", "Mentor", "Middletown", "Newark", "Painesville", "Reynoldsburg", "Toledo", "Westeville"};
		String[] search2 = new String[] {"112", "140", "130", "125", "138", "362", "140", "120", "120", "131", "121", "128", "342", "171", "122", "131", "109", "122", "120", "74", "122"};
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(new URL("https://www.hydroflow-usa.com/ohio-water-hardness#:~:text=Ohio%20water%20is%20considered%20hard,resident%20is%20around%20155%20PPM.").openStream()));
		String total = "";
		
		for(String sample = null; null != (sample = reader.readLine());)
		{
			total += sample;
		}
		
		for(int i = 0; i < search.length; i++)
		{
			String term = search[i];
			int index = total.indexOf(term);
			
			if(index != -1)
			{
				search[i] = "i dont exist";
				city.add(total.substring(index, index + term.length()));
				
				// search for search2 (hardness of the city)
				term = search2[i];
				index = total.indexOf(term);
				
				if(index != -1)
				{
					search2[i] = "i dont exist";
					hardness.add(Integer.parseInt(total.substring(index, index + term.length())));
				}
			}
		}
		
		System.out.println(city);
		System.out.println(hardness);
		
	}
	
	public void scraper()
	{
		new WebsScraper();
	}
	
	//call this method to return an arraylist of cities
	//if there are are any problems have cc dm me on instagram
	public ArrayList<String> cities
	{
		scraper();
		return city;
	}
	
	//call this method to return an arraylist of the hardness
	//if there are are any problems have cc dm me on instagram
	public ArrayList<Integer>
	{
		scraper();
		reuturn hardness;
	}
}
