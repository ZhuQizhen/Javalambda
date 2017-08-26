package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MyFilter {

	public static void main(String args[])
	{
		m1();
	}
	
	public static void m1()
	{
		List<String> strList = Arrays.asList("abc", "bdc", "defg", "jk");
		
		// create a new list, with all strings longer than 2
		List<String> filtered = strList.stream().filter(x -> x.length()> 2).collect(Collectors.toList());
		System.out.printf("Original List : %s, filtered list : %s %n", strList, filtered);

	}
}
