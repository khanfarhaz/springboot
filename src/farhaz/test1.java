package farhaz;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class test1 {
	public static void main(String[] args) {
		/*List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
		List<Integer> evenNumbers = numbers.stream()
		                                   .filter(n -> n % 2 == 0)             //Filter Even Numbers
		                                   .collect(Collectors.toList());
		System.out.println("evennumbers:" +evenNumbers);*/
		
	
		/*List<Integer> numbers = Arrays.asList(1, 3, 5, 7, 9, 2, 4, 6, 8, 0);
        OptionalInt max = numbers.stream()
                                 .mapToInt(Integer::intValue)                   //Find Maximum
                                 .max();                                          
        System.out.println("The maximum value in the list is: " + max);*/
	
	
		
	/*List<Integer> numbers = Arrays.asList(1, 3, 5, 7, 9, 2, 4, 6, 8, 0);
        int sum = numbers.stream()
                     .mapToInt(Integer::intValue)                                //Sum of Elements
                     .sum();

         System.out.println("The sum of the elements is: " + sum);*/
		
		
		
		
		/*List<String> strings = Arrays.asList("hello", "world", "java", "stream");
          List<String> uppercasedStrings = strings.stream()
                                                .map(String::toUpperCase)
                                                .collect(Collectors.toList());          //List of Names to Uppercase


        System.out.println(uppercasedStrings);*/
		
		
		/*List<Integer> numbers = Arrays.asList(9, 3, 5, 0, 8, 2, 7, 1, 6, 4);
        List<Integer> sortedNumbers = numbers.stream()
                                             .sorted()                             //Sort List
                                             .collect(Collectors.toList());

        System.out.println("Sorted list in ascending order: " + sortedNumbers);*/
	}
	

}
