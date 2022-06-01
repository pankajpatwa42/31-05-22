package ClassAssignment;

import java.util.Scanner;

public class Q4firstlast {

	public static void main(String[] args) {
		System.out.println("Enter four digit number :");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int last = num%10;
//		System.out.println(last);
		int first = num/1000;
//		System.out.println(first);
		
		int result = first+last;
		System.out.println("Sum of First and Last Digit is : "+result);
	}

}
