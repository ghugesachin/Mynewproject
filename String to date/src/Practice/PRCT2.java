package Practice;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PRCT2 
{
	public static void main(String[] args) throws Exception {
		String mono="9604428639";
		long mobile=Long.parseLong(mono);
		System.out.println(mono);
		System.out.println("int to double");
		int n=4564;
		double d=n;
		System.out.println(d);
		System.out.println("String to double");
		String s="986532";
		double d1=Double.parseDouble(s);
		System.out.println(d1);
		System.out.println("String to date");
		String date="06/05/2020";
		Date newdate=new SimpleDateFormat("MM/dd/yyyy").parse(date);
		System.out.println(newdate);
		System.out.println("int to double");
		int na=45;
		double na1=na;
		System.out.println(na1);
		System.out.println("Double to int ");
		double dob=963.5;
		int it=(int)dob;
		System.out.println(it);
		
	}

}
