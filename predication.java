package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class predication {
	
	public static void main(String args[])
	{
		m1();
	}
	
	public static void m1(){
	    List<String> languages = Arrays.asList("Java", "Scala", "C++", "Haskell", "Lisp");
	 
	    System.out.println("Languages which starts with J :");
	    filter(languages, (str)->str.startsWith("J"));
	 
	    System.out.println("Languages which ends with a ");
	    filter(languages, (str)->str.endsWith("a"));
	 
	    System.out.println("Print all languages :");
	    filter(languages, (str)->true);
	 
	    System.out.println("Print no language : ");
	    filter(languages, (str)->false);
	 
	    System.out.println("Print language whose length greater than 4:");
	    filter(languages, (str)->str.length() > 4);
	
	    //-----------------
	    Predicate<String> startsWithJ = (n) -> n.startsWith("J");
	    Predicate<String> fourLetterLong = (n) -> n.length() == 4;
	    System.out.println("Print language who starts with J and whose length greater than 4:");
	    filter(languages, startsWithJ.and(fourLetterLong) );
	}
	 
	public static void filter(List<String> names, Predicate<String> condition) {
	    for(String name: names)  {
	        if(condition.test(name)) {
	            System.out.println(name + " ");
	        }
	    }
	}
	
	public static void filter2(List<String> names, Predicate<String> condition) {
	    names.stream().filter((name) -> (condition.test(name))).forEach((name) -> 
	    {
	        System.out.println(name + " ");
	    }
	    );
	}
	
	
	
}
