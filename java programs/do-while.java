package abc;
import java.util.Scanner;

public class Dowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a,b,c;
    String choise;
    do
    {
    	Scanner sc= new Scanner(System.in);
    	 System.out.println("enter 2 number");
    	 a=sc.nextInt();
    	 b=sc.nextInt();
    	 c=a+b;
    	 System.out.println("addition is"+c);
    	 System.out.println(" do you want to continue?(yas/no)");
    	 choise= sc.next();
    }while(choise.equals("yas"));
	}

}
