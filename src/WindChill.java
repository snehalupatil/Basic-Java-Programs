import java.util.Scanner;
public class WindChill {

	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);
		
		 float t = in.nextFloat();
		 float v = in.nextFloat(); 
	     System.out.println("You entered temp "+t); 
	     System.out.println("You entered speed "+v);
	     
	     System.out.println(35.74+0.6215*t+((0.4275*t-35.75)*(Math.pow(v, 0.16))));
	     
	     

	}

}
