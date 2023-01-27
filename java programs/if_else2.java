package abc;
import java.util.Scanner;

public class program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a,b,c;
       Scanner sc=new Scanner(System.in);
       System.out.println("enter 3 number");
       a= sc.nextInt();
       b=sc.nextInt();
       c=sc.nextInt();
       if(a>c && a>b) {
    	   System.out.println("A is max");
    	   
       }else{
    	    if (b>c && b>a) {
    	    	System.out.println("b is max");
    	    
    	    }else{if (c>a && c>b) {
    	    			System.out.println("c is max");
    	    		}else {
    	    			
    	    	
    	    	}
    	    	System.out.println("end");
    	   }
    	   
       }
	}
}

