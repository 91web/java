package streamApi;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamApi2 {
    public static void main(String[] args) {
//      using stream to calculate the sum of numbers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numbers.stream().reduce(0, Integer::sum);
        System.out.println(sum);

//      using stream to collect unique string into set
        List<String> strings = Arrays.asList("apple", "bag", "apple", "dog", "eagle");
        Set<String> uniqueStrings = strings.stream().collect(Collectors.toSet());
        System.out.println(uniqueStrings);

//      using stream to find the first number greater than 3
        List<Integer> gnumbers = Arrays.asList(1, 2, 3, 4, 5);
        int firstNumGreaterThan3 = gnumbers.stream().filter(num -> num > 3).findFirst().orElse(0);
        System.out.println(firstNumGreaterThan3);

//      using stream to sort the strings in alphabetical order
        List<String> strings1 = Arrays.asList("banana", "apple", "dog", "eagle");
        List<String> sortedStrings = strings1.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedStrings);
    }
}