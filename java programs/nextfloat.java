import java.util.Scanner;

public class nextfloat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		float r,a;
    System.out.println("enter radius of circle");
          r=sc.nextFloat();
          a=3.14f*r*r;
          System.out.println("Area is"+a);
          
	}

}
