import java.util.Scanner;
public class Swap {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Two Numbers");
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=a;
	a=b;
	b=c;
	System.out.println("After Swapping"+" a="+a+" b="+b);
}
}
