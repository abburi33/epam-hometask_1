package EPAM.HOME_TASK_1;
import java.util.*;
public class calculator 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("Addition is "+add(a,b));
        System.out.println("Substraction is "+sub(a,b));
        System.out.println("Multiplication is "+mul(a,b));
        if(b!=0)
        System.out.println("Division is "+div(a,b));
        else
        	System.out.println("Invalid input");
	}
	public static int add(int a,int b)
	{
		return a+b;
	}
	
	public static int sub(int a,int b)
	{
		return a-b;
	}
	
	public static int mul(int a,int b)
	{
		return a*b;
	}
	
	public static int div(int a,int b)
	{
		return a/b;
	}
}
