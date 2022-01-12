package HashMap;

import java.util.HashMap;
import java.util.Iterator;

public class Prct 
{
	
	public static void main(String[] args) 
	{
		HashMap<String ,Object> hp=new HashMap<>();
		
		hp.put("name","Sachin");
		hp.put("Roll No", 72);
		hp.put("Mo No", 960442863);
		hp.put("village name", "Nimon");
		hp.put("Branch","Production");
		hp.put("perc", 45.6);
		
		System.out.println(hp.get("perc"));
		System.out.println(hp.get("Branch"));
		Iterator<String> itr = hp.keySet().iterator();
		while(itr.hasNext())
		{
			System.out.println();
		}
		
	}

}
