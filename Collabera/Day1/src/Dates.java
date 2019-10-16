import java.text.SimpleDateFormat;
import java.util.Date;

public class Dates {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		//display date in mm/ dd/ yyyy format
		SimpleDateFormat sd = new SimpleDateFormat(" MM / dd / yyyy h:m:s");
		System.out.println(sd.format(date));
	}

}
