
public class Swastik_pattern {

	public static void main(String[] args) {
		int count=0;
		int n=5;
		
		for(int i=0;i<n;i++)
		{
			count++;
			for(int j=0;j<n;j++)
			{

				if((j==0||j==2||j==3||j==4) && count==1)
					System.out.print(" *");
				else if(j==0 && count==4)
					System.out.print("  ");
				else if((j==3||j==1) && count==2)
					System.out.print(" .");
				else if((j==0||j==2))
					System.out.print(" *");
				else if((j==0 || j==2) && count==1)
					System.out.print(" *");
				else if(count==3)
					System.out.print(" *");
			
				else if((j==2||j==4)&& count==4)
					System.out.print(" *");
				else if((j==1||j==3) && count==4)
					System.out.print(" .");
				
				else if((j==0||j==1||j==2||j==4)&&count==5)
					System.out.print(" *");
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

}
