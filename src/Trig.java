import java.util.Scanner;

public class Trig {

	public static void main(String[] args) {double cosValue = Math.cos(radians); 
    System.out.println("cos(" + D + ") = " + cosValue); 
		Scanner in = new Scanner(System.in);
		
		double cosValue1 = Math.cos(radians); 
        System.out.println("cos(" + D + ") = " + cosValue1); 
		int D = in.nextInt(); 
		double radians = Math.toRadians(D);
		System.out.println("In radians="+radians);
	
		double cosValue = Math.cos(radians); 
        System.out.println("cos(" + D + ") = " + cosValue); 
        
        double sinValue = Math.sin(radians); 
        System.out.println("sin(" + D + ") = " + sinValue); 
        
        double tanValue = Math.tan(radians); 
        System.out.println("tan(" + D + ") = " + tanValue); 
	}

}
