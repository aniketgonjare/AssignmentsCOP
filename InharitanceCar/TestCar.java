package Tester;

import java.util.Scanner;

import com.code.*;

public class TestCar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Car[] arr=new Car[5];
        
		System.out.println("1.add BMW");
		System.out.println("2.add Ferrari");
		System.out.println("3.add Display");
		System.out.println("4.exit");
		int counter=0;
		int choice=0;
		
		do {
			System.out.println("enter choice");
			choice=sc.nextInt();
			
			switch(choice)
			{
			case 1:
				if(arr.length>counter)
				{
				System.out.println("enter modelno,color,airBags");
			   arr[counter]=new BMW(sc.nextInt(),sc.next(),sc.nextInt());
			   counter++;
				}
				else
					System.out.println("array is full");
					
				break;
			case 2:
				if(arr.length>counter)
				{
				System.out.println("enter modelno,color,NOS");
			   arr[counter]=new Ferrari(sc.nextInt(),sc.next(),sc.nextInt());
			   counter++;
				}
				else
					System.out.println("array is full");
				break;
			case 3:
				for(Car c:arr)
				{
					if(c!=null)
					System.out.println(c);
					
					if (c instanceof BMW)
					{
						((BMW) c).speed();
					}
					
					if (c instanceof Ferrari)
					{
						((Ferrari) c).color();
					}
				}
				break;
			case 4:
				System.out.println("exited");
				break;
			}
			
		}while(choice!=4);
		
		sc.close();
	}

}
