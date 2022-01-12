package HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class PracticeHashset 
{
	public static void main(String[] args) 
	{
		HashSet hst=new HashSet();
		hst.add("jay Bajarangbali");
		hst.add(56);
		hst.add(85.5);
		hst.add(56);
		hst.add(null);
		hst.add(null);
		System.out.println(hst);
		System.out.println("print records by using iterator---------");
		Iterator ithst = hst.iterator();
		while(ithst.hasNext())
		{
			System.out.println(ithst.next());
		}
		System.out.println("print records by using foreach loop---------");
		for(Object o:hst)
		{
			System.out.println(o);
		}
		
		System.out.println("-----------------remove duplicate elementfrom array list---------");

		ArrayList List=new ArrayList();
		List.add("Sachin");
		List.add("Ghuge");
		List.add(756);
		List.add(756);
		List.add(756);
		List.add(7.6f);
		List.add(7.6f);
		List.add(7.6f);
		List.add(7.9);
		List.add(7.9);
		List.add(7.9);
		List.add('c');
		System.out.println(List);
		//to remove duplicate element when order of insertion is not maintained
		HashSet hst1=new HashSet(List);
		System.out.println(hst1);
		
	}

}
