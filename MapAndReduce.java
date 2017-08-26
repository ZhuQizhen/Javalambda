package lambda;

import java.util.Arrays;
import java.util.List;

public class MapAndReduce {

	public static void main(String args[])
	{
		m2();
		m1();
	}
	
	public static void m1()
	{
		// add 12% without lambda formula
		List<Integer> costBeforeTax = Arrays.asList(100, 200, 300, 400, 500);
		double total = 0;
		for (Integer cost : costBeforeTax) {
		    double price = cost + .12*cost;
		    System.out.println(price);
		    total  += price;
		}
		System.out.println("Total : " + total);
	}
	
	public static void m2()
	{
		List<Integer> costBeforeTax = Arrays.asList(100, 200, 300, 400, 500);
		costBeforeTax.stream().map((cost) -> cost + .12*cost).forEach(System.out::println);
	
		double bill = costBeforeTax.stream().map((cost) -> cost + .12*cost).reduce((sum, cost) -> sum + cost).get();
		System.out.println("Total : " + bill);
	}
	
}
