package abc;
import java.util.Scanner;

public class program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String choise;
         int a,b,c;
         Scanner sc = new Scanner(System.in);
         System.out.println("enter your choise:(add,sub;mul;div");
         choise =sc.next();
         System.out.println("enter 2 number");
          a=sc.nextInt();
          b=sc.nextInt();
         switch (choise) {
         case "+":
        	  c=a+b;
         System.out.println("add is" +c);
         break;
         case "-":
        	  c=a-b;
        	 System.out.println("sub is" +c);
        	 break;
         case "*":
        	  c=a*b;
        	 System.out.println("mul is" +c);
        	 break;
         case"/":
        	  c=a/b;
        	  System.out.println("div is" +c);
        	 default :
        		 System.out.println("wrong choise");
         
         }
	}

}
