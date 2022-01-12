package LinkedHashset;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class PracticeLinkedhashset 
{
	public static void main(String[] args) 
	{
		LinkedHashSet linkset=new LinkedHashSet();
		linkset.add("Satyam");
		linkset.add(32);
		linkset.add(52.48);
		linkset.add(null);
		linkset.add(null);
		linkset.add(null);
		linkset.add(null);
		System.out.println(linkset);
		System.out.println(linkset.isEmpty());
		linkset.remove(32);
		System.out.println(linkset);
		ArrayList l=new ArrayList();
		l.add(0, linkset);
		l.add(null);
		l.add(null);
		l.add(null);
		System.out.println(l);
		LinkedHashSet linkset1=new LinkedHashSet(l);
		System.out.println(linkset1);
		
	}

}
