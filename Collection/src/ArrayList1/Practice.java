package ArrayList1;

import java.util.ArrayList;
import java.util.Collections;

public class Practice 
{
	public static void main(String[] args) 
	{
		ArrayList list=new ArrayList();
		list.add(98);
		list.add(46);
		list.add(75);
		list.add(63);
		list.add(91);
		list.add(35);
		list.add(43);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list  );
		for(Object o:list)
		{
			System.out.println(o);
		}
		System.out.println(Collections.emptyList());
		
	}

}
