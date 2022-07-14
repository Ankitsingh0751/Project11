package ASSIGNMENT_1;
import java.util.Scanner;

public class ElecBill {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the Units: ");
		
		double unit = s.nextInt();
		double Tprice;
		
		if(unit<100)
		{
			Tprice = unit*1.20;
			System.out.println("Total Bill: " + Tprice);
		}
		else if(unit>100 && unit<300)
		{
			Tprice = 100 * 1.20 + (unit - 100) * 2;  
			System.out.println("Total Bill: " + Tprice);
		}
		else
		{
			Tprice = 100 * 1.20 + 200 * 2 + (unit - 300) * 3;  
			System.out.println("Total Bill: " + Tprice);
		}
	}

}
