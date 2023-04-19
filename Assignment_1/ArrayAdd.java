
/*16:read two int array...and store both in third array and display third array
1 2 3
5 6 7 8 9
1 2 3 5 6 7 8 9*/
import java.util.Scanner;

public class ArrayAdd {
	public static void main(String[] args) {
		int a[]=new int[3];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first Array Elements = ");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
			
			int b[]=new int[5];
			System.out.println("Enter second Array Elements = ");
			for (int j = 0; j < b.length; j++) {
				b[j] = sc.nextInt();
			}
			
			int c[]=new int[8];
			
			for(int i=0;i<3;i++)
			{
			 c[i]=a[i];
			}
			
			for(int i=3, j=0;i<8;i++,j++)
			{
			 c[i]=b[j];
			}
			System.out.print("third array elements = ");
			for(int i=0;i<8;i++)
			{
				System.out.print(c[i]+" ");
			}
		
	}

}
