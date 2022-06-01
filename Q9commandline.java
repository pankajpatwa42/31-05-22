<<<<<<< HEAD
package ClassAssignment;

public class Q9commandline {

	public static void main(String[] args) {
		int price,quantity,totalamt;
		price = Integer.parseInt(args[0]);
		quantity = Integer.parseInt(args[1]);
		
		totalamt = price *quantity;
		
		if(quantity >=10)
		{
			
			int discount = (int) (totalamt*0.10);
			totalamt = totalamt-discount;
			System.out.println("Total amt to be paid is :"+totalamt);
		}else
			System.out.println("Total amt to be paid is :"+totalamt);

	}

}
=======
package ClassAssignment;

public class Q9commandline {

	public static void main(String[] args) {
		int price,quantity,totalamt;
		price = Integer.parseInt(args[0]);
		quantity = Integer.parseInt(args[1]);
		
		totalamt = price *quantity;
		
		if(quantity >=10)
		{
			
			int discount = (int) (totalamt*0.10);
			totalamt = totalamt-discount;
			System.out.println("Total amt to be paid is :"+totalamt);
		}else
			System.out.println("Total amt to be paid is :"+totalamt);

	}

}
>>>>>>> ed6a5d6d63d4ccf102085f2b2087dd513bd5756d
