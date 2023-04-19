//5:Write a program to find m to the power n
import java.util.Scanner;
public class Power {
	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		System.out.println("Enter Base and Power");
		int m=a.nextInt();
		int n=a.nextInt();
		int c=m;
		for(int i=1;i<n;i++)
		{
			m*=c;
		}
		System.out.println("m to the power n = "+m);
	}

}
