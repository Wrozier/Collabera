package ArrayProcessing;
import java.util.Scanner;
public class MonthArray {

	public static void main(String[] args) {
	  Scanner scanner=  new Scanner(System.in);
	  double[] rainfall = new double[12];
	  String[] monthName = new String[12];
	  monthName[0] = "January";
	  monthName[1] = "Feb";
	  monthName[2] = "Mar";
	  monthName[3] = "Apr";
	  monthName[4] = "May";
	  monthName[5] = "Jun";
	  monthName[6] = "Jul";
	  monthName[7] = "Aug";
	  monthName[8] = "Sep";
	  monthName[9] = "Oct";
	  monthName[10] = "Nov";
	  monthName[11] = "Dec";
	 double annualAverage, sum = 0.0;
	  
	  for(int i = 0; i <rainfall.length; i++) {
		  System.out.print("Rainfall for " + monthName[i] + ":");
		  rainfall[i] = scanner.nextDouble();
		  sum += rainfall[i];  
	  }
	  annualAverage = sum / rainfall.length;

	}

}
