
import java.lang.Math; 
public class random {

	public static void main(String[] args) {
	
    
        float maxno=0;
        double rand;
        //int i;
        double[] arr= new double [5];
        
  
        
        for (int i = 0; i < 5; i++) { 
            rand = (Math.random());
            arr[i]=rand;
            System.out.print(arr[i]+","); 
            
        }
        
        double sum=0;
        for (int j=0;j<arr.length;j++) {
        	
        	sum=sum+arr[j]; 
        	
        }
        double avg=sum/arr.length;
        
        System.out.println("Average="+avg);

}
}