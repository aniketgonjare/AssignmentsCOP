import java.util.Scanner;

public class dimond {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter first array's size:");
    int[] a=new int[sc.nextInt()];
    System.out.println("enter array elements");
    for(int i=0;i<a.length;i++)
    {
    	 a[i]=sc.nextInt();
    }
    
    System.out.println("enter second array's size:");
    int[] b=new int[sc.nextInt()];
    System.out.println("enter array elements");
    for(int i=0;i<b.length;i++)
    {
    	 b[i]=sc.nextInt();
    }

    int c=a.length+b.length;
    int[] d=new int[c];
    int j=0;
    int k=0;
    	for( ;j<a.length;j++)
    	{
    	d[j]=a[j];
    	}
    	for( ; k<b.length;k++,j++)
    	{
    		d[j]=b[k];
    	}
    	System.out.println("third array:");
    	
    	for(int l=0;l<d.length;l++)
    	{
    		System.out.print( d[l]);
    	}
    
    
}
}
