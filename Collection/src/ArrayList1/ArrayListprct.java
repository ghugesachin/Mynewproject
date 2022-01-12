package ArrayList1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListprct 
{
	public static void main(String[] args) 
	{
		ArrayList lt=new ArrayList();
		lt.add("Sachin");
		lt.add("Ghuge");
		lt.add(45);
		lt.add(78.5f);
		lt.add(98.5);
		lt.add('A');
		lt.add(null);
		lt.add(null);
		System.out.println(lt);
		Object[] Arr = lt.toArray();
		ArrayList<Integer> alll=new ArrayList<Integer>();
		
		
		Collections.sort(lt);
		System.out.println("--------------------------------------------------");
		
		
		System.out.println("==================================================");
		System.out.println("array");
		System.out.println(Arr[3]);
		lt.add(5, 87);
		ArrayList lt1=new ArrayList();
		lt1.add("Sachin");
		lt1.add("Ghuge");
		lt1.add(45);
		lt1.add(78.5f);
		lt1.add(98.5);
		lt1.add('A');
		lt1.add(null);
		lt1.add(null);
		lt1.add(5, 87);
		System.out.println("------------new list ---------------");
		System.out.println(lt);
		System.out.println(lt.contains('A'));
		System.out.println("--------------get index of");
		System.out.println(lt.get(6));
		System.out.println(lt.size());
		
		System.out.println("---------------------------------");
		System.out.println(lt);
		System.out.println(lt1);
		System.out.println(lt.equals(lt1));
		System.out.println("-------------print array list  by using iterator cursor-------");
		Iterator irlt=lt.iterator();
		while(irlt.hasNext())
		{
			System.out.println(irlt.next());
		}
		System.out.println("------------print arraylist by using list iterator cursor------- ");
		ListIterator lrlt=lt.listIterator();
		while(lrlt.hasNext())
		{
			System.out.println(lrlt.next());
		}
		System.out.println("-----------print arraylist by using for each loop-----------");
		for(Object ob:lt)
		{
			System.out.println(ob);
		}
		
	}

}
