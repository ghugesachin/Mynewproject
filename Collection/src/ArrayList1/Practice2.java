package ArrayList1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Practice2 
{
	

	public static void main(String[] args) throws ParseException 
	{
		String number="9604428639";
		long no = Long.parseLong(number);
		System.out.println(no);
		int a=96;
		String [] Arr= {"sac","Ghuge"};
		String sa = Arrays.toString(Arr);
		System.out.println(sa);
		System.out.println(sa.charAt(0));
		String date="23/10/2021";
		String date1="96";
		String date2="96.5";
		Date gdate = new SimpleDateFormat("dd/MM/yy").parse(date);
		System.out.println();
		float flt = Float.parseFloat(date2);
		System.out.println(flt);
		int Fah = Integer.parseInt(date1);
		System.out.println(Fah);
		System.out.println(gdate);
	}
	
	


}
