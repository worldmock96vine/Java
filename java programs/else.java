package abc;

import java.util.Scanner;

public class assigment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int unit;
		 double amt;
		 
		  Scanner ob= new Scanner(System.in);
		  System.out.println(" enter total unit consumed:");
		  amt=ob.nextDouble();
		  unit=ob.nextInt();
		    
		  if(unit<=50 )
		  { 
			 double amt1 = (0.50*50) /20;
			  System.out.println(+amt1);
		  }
		  else if(unit<=100)
		  {
			  double amt2 = (0.75*100)/20;
			  System.out.println(+amt2);
		  }
		  else if (unit<=150)
		  {
			  double amt3 = (1.20*150)/20;
			  System.out.println(+amt3 ); 
		  }
		  else if(unit<=250)
		  {
			  double amt4 = (1.50*250)/20;
			  System.out.println( +amt4);
		  }
		  else
		  {
			System.out.println("An additional surcharge of 20% is added to the bill" +amt);
		  }
	}
}