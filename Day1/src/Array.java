
/*15:Create Menu driven program for array operations.
1:Read Array 2:Print Array 3:Search element in array 4:Reverse Array 5:Even number from array6:sum of array element
*/
import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		System.out.println(
				"1:Read Array \n2:Print Array \n3:Search element in array \n4:Reverse Array \n5:Even number from array\n6:sum of array element");
		System.out.println("0.Exit");

		int choice = 0;
		do {
			System.out.println("\n Enter choice");
			choice = sc.nextInt();
			switch (choice) {
			case 0: System.out.println("Exit");
					break;
			case 1:
				System.out.println("Enter Array Elements = ");
				for (int i = 0; i < arr.length; i++) {
					arr[i] = sc.nextInt();
				}
				break;
			case 2:
				System.out.println("Enter Array Elements = ");
				for (int i = 0; i < arr.length; i++) {
					System.out.print(arr[i] + " ");
				}
				break;
			case 3:
				System.out.println("Enter Element = ");
				int b = sc.nextInt();
				boolean flag=false;
				for (int i = 0; i < arr.length; i++) {
					if (b == arr[i]) {
						flag=true;
					}

				}
				if(flag==true)
				{
					System.out.println("element is  present in array");
				}
				else
				{
					System.out.println("element is not present in array");
				}
				break;
			case 4:
				
				for (int i = arr.length-1; i >=0; i--) {
					System.out.print(arr[i] + " ");
				}
				break;
			case 5:
				
				for (int i = 0; i<= arr.length-1; i++) {
					if(arr[i]%2==0)
					{
						System.out.print(arr[i]+" ");
					}
				}
				break;
			case 6:int sum=0;
				for (int i = 0; i<= arr.length-1; i++) {
					sum+=arr[i];
				}
				System.out.println("sum of array elements is = "+sum);
				break;
			default:System.out.println("invalid choice!!!");
					break;
				
			}
		} while (choice != 0);
		System.out.println("---------end of while----------");
	}

}
