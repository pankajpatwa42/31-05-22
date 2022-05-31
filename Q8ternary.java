package ClassAssignment;

import java.util.Scanner;

public class Q8ternary {

	public static void main(String[] args) {
		int a ,b, c,d;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter all three number : ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
  		d= c >(a>b?a:b)? c:((a>b)?a:b);
		System.out.println("Largest Number is "+d );
	
	}

}
   