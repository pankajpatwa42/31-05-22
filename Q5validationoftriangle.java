package ClassAssignment;

import java.util.Scanner;

public class Q5validationoftriangle {

	public static void main(String[] args) {
		int side1,side2,side3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the Three side of Triangle : ");
		side1 = sc.nextInt();
		side2 = sc.nextInt();
		side3 = sc.nextInt();
		
		if((side1+side2 >side3)&&(side2+side3 >side1)&&(side1+side3 >side2)) {
			System.out.println("It is Valid Triangle");
		}else
		{
			System.out.println("It is not Valid Triangle");

		}
	}

}
