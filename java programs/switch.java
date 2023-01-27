package abc;

import java.util.Scanner;

public class assigment2 {


	public static void main(String[] arg) {
	String choice;
	int a,b,c;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter your choice:(add sub mul div)");
	choice =sc.next();
	System.out.println("enter 2 nums");
	a=sc.nextInt();
	b=sc.nextInt();
    switch(choice) 
    {
    case "+":
    	 c=a+b;
    	System.out.println("add is" +c);
    	break;
    case"-":
    	c=a-b;
    	System.out.println("sub is" +c);
    	break;
    case"*":
    	c=a*b;
    	System.out.println("mul is" +c);
    	break;
    case"/":
    	c=a/b;
    	System.out.println("div is" +c);
    	default:
    		System.out.println("wrong choice");
    }
	
		 
	}
}