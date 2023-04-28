package Com.Vehicle;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ValidateLicence {
	
	public static void ValidateLicence(String exp_date) throws ParseException, CustomException
	{
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		Date d1=sdf.parse(exp_date);
	  Date d3=new Date();
	  if(d1.after(d3))
	  {
		 System.out.println("valid licence");
	  }
	  if(d1.before(d3))
	  {
		  throw new CustomException("Licence is Expired");
	  }
	 
	}
}
