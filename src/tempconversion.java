import java.util.Scanner;

public class tempconversion {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("1.C to F \n2.F to C");
		 int i = in.nextInt();
		 if (i==1){
			 System.out.print("Enter temp in Celcius=");
			 float C = in.nextFloat(); 
			 System.out.println("temp in Fahrenheit=");
			 System.out.println((C*(9/5))+32);
		 }
		 else {
			 System.out.println("Enter temp in Fahrenheit= ");
			 float F = in.nextFloat(); 
			 System.out.println("temp in Celcius= ");
			 System.out.println((F-32)*(5/9));
			 
		 }
	}

}
