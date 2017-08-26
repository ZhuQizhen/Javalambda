package lambda;

import java.util.Arrays;
import java.util.List;

public class Foreach {

	public static void main(String args[])
	{
		m1();
	}
	
	public static void m1()
	{
		List<String> features = Arrays.asList("Lambdas", "Default Method", "Stream API", "Date and Time API");
		features.forEach(n -> System.out.println(n));
		 
		// ʹ��Java 8�ķ������ø����㣬����������::˫ð�Ų�������ʾ��
		// ��������C++����������������
		features.forEach(System.out::println);
	}
}
