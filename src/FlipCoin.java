import java.util.Scanner;

public class FlipCoin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		 int t = in.nextInt();
		 int h = 0;

		 for (int i = 1; i <= t; i++) {
		
			if (Math.random() > 0.5){
				System.out.println("Heads");
				h++;
				}
			else{
				System.out.println("Tails");
	
			}
			
	}
		 System.out.println(h);
		 System.out.println(t);
//		 System.out.println("Percentage of Heads "+((int)(h/t))*100+"%");
		 System.out.println("ttttttttttt"+h/t);
		 System.out.println("ttttttttttt"+t/h);
}
}