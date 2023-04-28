package Com.Vehicle;

public class ValidateSpeed  {
    private static int min_speed;
    private static int max_speed;
    static
    {
    	min_speed=40;
    	max_speed=80;
    }
    
    public static void ValidateSpeed(int speed) throws CustomException
    {
    	if(speed<min_speed)
    	{
    		throw new CustomException("you are diving too slow...");
    	}
    	if(speed>max_speed)
    	{
    		throw new CustomException("you are driving too fast..");
    	}
    	else
    	{
    		System.out.println("in range");
    	}
    }
    
}
