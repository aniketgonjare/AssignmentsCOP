package Com.Vehicle;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TestSpeed {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in);) {
		
		System.out.println("enter speed");
		ValidateSpeed.ValidateSpeed(sc.nextInt());
		System.out.println("enter date:dd/mm/yyyy");
		ValidateLicence.ValidateLicence(sc.next());
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
	}

}
