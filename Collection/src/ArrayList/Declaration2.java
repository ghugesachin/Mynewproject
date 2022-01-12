package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Declaration2 
{
	public static void main(String[] args) 
	{
		ArrayList<Object> newarray=new ArrayList<Object>();
		newarray.add("Sunil");
		newarray.add(56);
		newarray.add("Sachin");
		newarray.add('S');
		newarray.add(98.f);
		Iterator<Object> iter = newarray.iterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
		System.out.println(newarray);
		System.out.println("-------------for each loop--------------");
		for(Object nl:newarray)
		{
			System.out.println(nl);
		}
		
		
		
		
		
	}

}
