package ClassAssignment;

import java.util.Scanner;

public class Q10days_month {

	public static void main(String[] args) {
		int input ,months ,days;
		System.out.println("Enter numbers of days :");
		Scanner sc = new Scanner(System.in);
		input = sc.nextInt();
		if(input>=30) {
			months = input/30;
			input = input%30;
			System.out.println("No. of Months :"+months);
			System.out.println(input);
			System.out.println("No. of days :"+input);
		}
		
	}

}
