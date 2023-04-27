package com.app.tester;
import java.util.Scanner;

import com.app.fruits.*;
public class FruitBasket {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of basket:");
		int index=sc.nextInt();
		Fruit[] FruitBasket=new Fruit[index];

		System.out.println("1.Add Mango");
		System.out.println("2.Add Orange");
		System.out.println("3.Add Apple");
		System.out.println("4.Display names of all fruits");
		System.out.println("5.Dispay name, color, weight, taste");
		System.out.println("6.Mark a fruit in a basket , as stale");
		System.out.println("7.Mark all sour fruits stale ");
		System.out.println("8.invoke specific functionality");
		System.out.println("9.exit");
		
		int choice=0;
		int count=0;
		
		do {
			System.out.println("enter your choice:");
			choice=sc.nextInt();
			
			switch(choice)
			{
			case 1:
				if(index>count)
				{
				System.out.println("Enter name, color, weight");
				FruitBasket[count++]=new Mango(sc.next(),sc.next(),sc.nextInt());
				
				}
				else
				{
					System.out.println("basket is full");
				}
				break;
			case 2:
				if(index>count)
				{
					System.out.println("Enter name, color, weight");
					FruitBasket[count++]=new Orange(sc.next(),sc.next(),sc.nextInt());
			
				}
				else
				{
					System.out.println("basket is full");
				}
				break;
			case 3:
				if(index>count)
				{
					System.out.println("Enter name, color, weight");
					FruitBasket[count++]=new Apple(sc.next(),sc.next(),sc.nextInt());
			
				}
				else
				{
					System.out.println("basket is full");
				}
				break;
			case 4:
				   for(Fruit f: FruitBasket)
				   {
					   if(f!=null)
					   System.out.println(f.getName());
				   }
				break;
			case 5:
				for(Fruit f: FruitBasket)
				   {
					   if(f!=null)
					   System.out.println(f+"taste"+f.taste());
				   }
				break;
			case 6:
				System.out.println("enter index number:");
				int g=sc.nextInt();
				if(g>=0 && g<count)
				{
				if(FruitBasket[g].getFresh()==false)
				{
					System.out.println(FruitBasket[g].getName()+" is alredy stale");
				}
				else
				{	
				 FruitBasket[g].setFresh(false);
				 System.out.println("marked "+FruitBasket[g].getName()+ " as stale");
				}
				}
				else
				{
					System.out.println("no fruit is present at the index!!");
				}
				
				break;
			case 7:
				int p=0;
				for(Fruit f:FruitBasket)
				{
					if(f!=null)
					{
						
					if(f.taste().equals("sour"))
					{
						p++;
						f.setFresh(false);
					}
					}
				}
				if(p>0)
				System.out.println("marked all fruits as stale");
				else
					System.out.println("no fruit's taste is sour");
				break;
			case 8:
				System.out.println("enter index");
				int l=sc.nextInt();
				
				
				if(l>=0 && l<=count)
				{
					if(FruitBasket[l] instanceof Mango)
					 ((Mango)FruitBasket[l]).pulp();
					
					if(FruitBasket[l] instanceof Orange)
						((Orange)FruitBasket[l]).juice();
					
					if(FruitBasket[l] instanceof Apple)
						((Apple)FruitBasket[l]).jam();
  
				}
				else
				{
					System.out.println("no fruit is present at the index!!");
				}
				break;
			case 9:
				System.out.println("thank you..!");
				break;
			default:System.out.println("invalid choice!!");
					break;
			}
			
			
		}while(choice!=9);
		sc.close();		

	}

}
