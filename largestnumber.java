package Week05;
import java.util.Scanner;
public class largestnumber {
    public static void main(String[] args) {
	Scanner cs=new Scanner(System.in);
	System.out.println("enter the first number");
	int num1=cs.nextInt();
	System.out.println("enter the second number");
	int num2=cs.nextInt();
	System.out.println("enter the third number");
	int num3=cs.nextInt();
	int largest;
	if(num1>num2)
	{
		if(num1>num3)
	        largest=num1;
		else
			largest=num3;
	}
	else {
		if(num2>num3)
			largest=num2;
		else
			largest=num3;
	}
	System.out.println("the largest number is"+largest);
	}
}

