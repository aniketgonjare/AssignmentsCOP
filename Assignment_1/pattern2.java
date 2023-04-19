import java.util.Scanner;
public class pattern2{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int sum=1;
	int s=1;
	System.out.println("enter the value");
	int n=sc.nextInt();
    for(int i=0;i<n;i++)
    {
    	for(int j=n;j>i;j--)
    	{
    		System.out.print(" ");
    	}
    	sum=s;
    	for(int j=0;j<=i*2;j++)
    	{
    		System.out.print(sum);
    		sum=(sum*(i-j+1))/(j+1);
    	}
    	s++;
    	System.out.println("");
    }
    sc.close();
}
}
