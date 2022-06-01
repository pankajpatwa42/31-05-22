package ClassAssignment;

import java.util.Scanner;

public class Q2amttobank {

	public static void main(String[] args) {

		float p,t,si,fa;
		System.out.println("Enter Principal Amount and time Period");
		Scanner sc = new Scanner(System.in);
		p=sc.nextFloat();
		t=sc.nextFloat();
		si=(float) ((p*t*7.5)/100);
		
		fa = p+si;
		System.out.println("The final amount to pay : "+fa);
		
		
	}

}
