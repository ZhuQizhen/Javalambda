package lambda;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class MyCalculus {
	public static void main(String args[])
	{
		m1();
	}
	
	public static void m1()
	{
		List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
		IntSummaryStatistics stats = primes.stream().mapToInt((x) -> x).summaryStatistics();
		System.out.println("Highest prime number in List : " + stats.getMax());
		System.out.println("Lowest prime number in List : " + stats.getMin());
		System.out.println("Sum of all prime numbers : " + stats.getSum());
		System.out.println("Average of all prime numbers : " + stats.getAverage());
	}
}
