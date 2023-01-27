package abc;
import java.util.Scanner;

public class program1 {

	public static void main(String[] args) {
	
		int a=153, b,c,d,e = 56 ,f;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter 3 digit number");
		a=sc.nextInt();
		b=a/100;
		System.out.println(b);
		c=a%100;
		d=c/10;
		System.out.println(d);
	    c=c%10;
	    System.out.println(e);
	    f=b*b*b+d*d*d+e*e*e;
	    if(a==f) {
	    	System.out.println("amstrong  number");
	    }
	    else
	    {
	    	System.out.println("not amstrong  number");
	    }
	}

}
