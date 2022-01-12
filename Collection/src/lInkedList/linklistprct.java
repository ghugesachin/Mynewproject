package lInkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class linklistprct 
{
	public static void main(String[] args) 
	{
		LinkedList llt=new LinkedList();
		llt.add("Satyam");
		llt.add(85.5f);
		llt.add('A');
		llt.add(56);
		System.out.println(llt);
		Iterator irllt = llt.iterator();
		while(irllt.hasNext())
		{
			System.out.println(irllt.next());
		}
	}

}
