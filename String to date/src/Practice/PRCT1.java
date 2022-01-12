package Practice;


import java.text.SimpleDateFormat;
import java.util.Date;

public class PRCT1 
{
	public static void main(String[] args) throws Exception
	{
		String date="01/09/2021";
		Date newdate=new SimpleDateFormat("dd/MM/yyyy").parse(date);
		System.out.println(newdate);
//		package ArrayList1;
//		import java.text.SimpleDateFormat;  
//		import java.util.Date;  
//		public class Practice1 {  
//		public static void main(String[] args)throws Exception {  
//		    String today="19/10/2021";  
//		    Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(today);  
//		    System.out.println(today+"\t"+date1);  
//		}  
//		}
		
	}

}
