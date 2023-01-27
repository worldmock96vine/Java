package magic;

import java.util.Scanner;
public class monu {

	public static void main(String[] args) {
          Scanner sc = new Scanner (System.in);
          System.out.println("enter an integar");
          String str = sc.nextLine();
          try {
        	  int x = Integer.parseInt(str);
        	  System.out.println("the square valueis :"+x*x);
        	  System.out.println("the work has been done succefully");
          }catch(NumberFormatException e) {
        	  System.out.println("entered input is not a valid format for an integar");
          }
              sc.close();
	} 

}
