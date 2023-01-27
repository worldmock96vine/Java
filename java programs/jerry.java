 class jerry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try {
        	int i,sum=0,avg;
        	int x = args.length;
        	int []arr = new int [x];
        	for(i=0;i<x;i++) {
        		arr[i]= Integer.parseInt(args[i]);
        	}
        
        for(i=0;i<x;i++) {
        	sum= sum+arr[i];
        }
        avg= sum/x;
        System.out.println("sum is"+sum);
        System.out.println("avg is"+avg);
        	
        }catch(NumberFormatException e) {
        	System.out.println("please enter number");
        }catch(ArithmeticException e) {
        	System.out.println("please enter non number");
        }
	}

}