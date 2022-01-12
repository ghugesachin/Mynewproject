package ArrayList1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Practice1 
{  
	public static void main(String[] args) 
	{
		ArrayList lst=new ArrayList<>();
		lst.add(58);
		lst.add("fg");
		lst.add(65);
		lst.add(23);
		System.out.println(lst);
		Collections.sort(lst);
		
	}  
}  