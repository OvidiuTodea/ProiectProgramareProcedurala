package main;

import java.util.Calendar;

public class SwitchWeekDay {

	public static void main(String[] args) {

		Calendar c = Calendar.getInstance();
		int day =  c.get(Calendar.DAY_OF_WEEK);

		switch (day) {
		case 1:
			System.out.println("Sunday");
			break;	
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;	
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;
		default:
			break;
		
		}

	}

}
