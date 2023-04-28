package Com.Vehicle;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TestSpeed {

	public static void main(String[] args) throws CustomException, ParseException {
		Scanner sc=new Scanner(System.in);
		try {
		
		System.out.println("enter speed");
		ValidateSpeed.ValidateSpeed(sc.nextInt());

		}
		catch(CustomException  e)
		{
			e.printStackTrace();
		}
		
	
			try {
				
				System.out.println("enter date:dd/mm/yyyy---");
			
				ValidateLicence.ValidateLicence(sc.next());
				}
				catch(CustomException | ParseException e)
				{
					e.printStackTrace();
				}
		
	}

}
