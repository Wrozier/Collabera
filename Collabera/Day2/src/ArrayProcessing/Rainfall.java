package ArrayProcessing;
import java.util.Scanner;

public class Rainfall {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double[]rainfall = new double[12];
		
		double annualAverage,
		sum = 0.0;
		
		for(int i = 0; i < rainfall.length; i++) {
			System.out.print("Rainfall for month  " + (+1));
			rainfall[i]= scanner.nextDouble();
			sum += rainfall[i];	
		}
		annualAverage = sum / rainfall.length;
	}

}
