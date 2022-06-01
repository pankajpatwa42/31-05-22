package ClassAssignment;

import java.util.Scanner;

public class Q7InsurancePolicy {

	public static void main(String[] args) {
		String status, gender;
		byte age;
		Scanner sc = new Scanner(System.in);
		System.out.println("Select Yes or No");
		System.out.println("Are you Married : ");
		status = sc.next().toLowerCase();
		if(status.equals("yes")) 
			{
			System.out.println("Insured under Insurance Policy");
			}
		else {
			System.out.println("Enter gender :");
			gender = sc.next().toLowerCase();
			System.out.println("Enter age ");
			age = sc.nextByte();
			if(gender.equals("male") && age >30)
			{
				System.out.println("Insured under Insurance Policy");
			}else if(gender.equals("female") && age>25)
				{
					System.out.println("Insured under Insurance Policy");

				}
			else
					System.out.println("Not Insured under Insurance Policy");
			

		}
		
	}
 
}
