package ArrayList;

import java.util.ArrayList;

public class Declaration3 
{
	public static void main(String[] args) {
		ArrayList List=new ArrayList();
		List.add("Sachin");
		List.add("Ghuge");
		List.add(756);
		List.add(7.6f);
		List.add(7.9);
		List.add('c');
		System.out.println(List);
		System.out.println("-----------Remove--------------------");
		List.remove(5);
		System.out.println(List);
		System.out.println("-----------update arraylist----------");
		List.set(0, "SACHIN");
		System.out.println(List);
		System.out.println("-----------");
//		List.remove(7.9);
		List.remove(4);
		System.out.println(List);
		
	}

}
