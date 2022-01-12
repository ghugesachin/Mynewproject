package ArrayList1;

import java.util.ArrayList;
import java.util.Iterator;

public class Declaration {
	public static void main(String[] args) {
		ArrayList al= new ArrayList();
		ArrayList al1= new ArrayList();
		al.add("Sachin");
		al.add(9604);
		al.add("ghugesachind");
		al.add(8999);
		al.add(45.9f);
		al.add('a');
		al.add(6, 45);
		System.out.println(al);
		System.out.println(al.get(3));
		al.set(2, 122);
		System.out.println("--------new-------");
		System.out.println(al);
		System.out.println(al1.isEmpty());
		al.add(null);
		al.add(null);
		al.add(null);
		al.add(null);
		al1.add(454);
		al1.add(453);
		al1.add(452);
		al1.add(451);
		al.addAll(al1);
		System.out.println(al1);
		System.out.println(al);
		int size = al.size();
		System.out.println(size);
		System.out.println("---------contain---------");
		System.out.println(al.contains(459));
		System.out.println("-----------itereator-----------");
	
		Iterator iter = al.iterator();
		while (iter.hasNext()) 
		{
			System.out.println(iter.next());
			
		}
		System.out.println("----------");
		System.out.println(al.size());
		al.remove(7);
		System.out.println("---------------------new");
		System.out.println(al);
		System.out.println(al.size());
		
		
	}

}
