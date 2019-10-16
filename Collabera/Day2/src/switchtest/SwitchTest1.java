package switchtest;

public class SwitchTest1 {
	
	public static void main(String[]args) {
		switchTest();
	}
	
	public static void switchTest() {
		int month = 8;
		
		String monthString=" ";
				
			switch(month) {
			//case statements within the switch block
			case 1: monthString="1 - Jan";
			//break;
			case 2: monthString="2 - Feb";
			//break;
			case 3: monthString="3 - Mar";
			//break;
			case 4: monthString="4 - Apr";
			//break;
			case 5: monthString="5 - May";
			//break;
			case 6: monthString="6 - Jun";
			//break;
			case 7: monthString="7 - Jul";
			//break;
			case 8: monthString="8 - Aug";
			//break;
			case 9: monthString="9 - Sep";
			//break;
			case 10: monthString="10 - Oct";
			//break;
			default: System.out.println("Invaild Month");
		}
			System.out.println("The month is");
	}
	
	
}