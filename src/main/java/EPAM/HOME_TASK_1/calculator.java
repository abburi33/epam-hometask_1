package EPAM.HOME_TASK_1;
import java.util.*;
public class calculator {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("Addition is "+(a+b));
        System.out.println("Substraction is "+(a-b));
        System.out.println("Multiplication is "+(a*b));
        if(b!=0)
        System.out.println("Division is "+(a/b));
        else
        	System.out.println("Invalid input");
	}

}
