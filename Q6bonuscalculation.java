package ClassAssignment;

import java.util.*;
public class Q6bonuscalculation {
	static long computeSalary(long salary) {
		double ta,hra,da,pf,bonus,gross;
		
		hra = 0.2*salary;
		da = 0.15*salary;
		ta = 0.10*salary;
		pf = 0.12*salary;
		
		if (salary>=20000)
			bonus=0.10*salary;
		else
			bonus=0.20*salary;
		
		gross = Math.round(salary+hra+ta+da+bonus-pf);
		
		return (long) gross;
	}

	public static void main(String[] args) {
		long salary;
		System.out.println("Enter Basic Salary :");
		Scanner sc = new Scanner(System.in);
		salary = sc.nextLong();
		System.out.println(computeSalary(salary));
	}

}
