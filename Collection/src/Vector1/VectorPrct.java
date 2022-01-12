package Vector1;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorPrct 
{
	public static void main(String[] args) 
	{
		Vector vlt=new Vector();
		vlt.add("nothing");
		vlt.add(65);
		vlt.add(45.9f);
		vlt.add('C');
		Vector vlt1=new Vector();
		vlt1.add("nothing");
		vlt1.add(65);
		vlt1.add(45.9f);
		vlt1.add('C');
		System.out.println(vlt);
		System.out.println("-------------------new vector-----------");
		System.out.println(vlt1);
		System.out.println("----------------print vector by using iterator Cursor");
		System.out.println(vlt.contains(45.9f));
		Iterator itvlt = vlt.iterator();
		while(itvlt.hasNext())
		{
			System.out.println(itvlt.next());
		}
		System.out.println("-------------------print vector by using list iterator cursor");
		ListIterator lrvlt = vlt.listIterator();
		while(lrvlt.hasNext())
		{
			System.out.println(lrvlt.next());
		}
		System.out.println("By using enumaration cursor");
		Enumeration evlt = vlt.elements();
		while(evlt.hasMoreElements())
		{
			System.out.println(evlt.nextElement());
		}
	}

}
