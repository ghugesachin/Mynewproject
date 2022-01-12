package lInkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class PracticeLinklist 
{
	public static void main(String[] args) 
	{
		LinkedList list=new LinkedList();
		list.add("Sachin");
		list.add("Ghuge");
		list.add(98);
		list.add(98.96f);
		list.add('A');
		list.add(null);
		System.out.println(list);
		Iterator it = list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("By using for each");
		for(Object o:list)
		{
			System.out.println(o);
		}
		System.out.println("By using listiterator");
		ListIterator li = list.listIterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		System.out.println("By using for loop");
		for(int i=0;i<=list.size()-1;i++)
		{
			System.out.println(list.get(i));
		}
	}

}
