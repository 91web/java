package streamApi;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApi {
    public static void  main( String[] arg){
        //Given a list of integers, use the Stream API to calculate the sum of all the numbers.
        List<Integer> mark = Arrays.asList(1,2,3,4,5,6,7,8,9,11,5);

        int sum=0;
            sum= mark.stream().mapToInt(n-> n).sum();
        System.out.println("Sum of all the mark is : " + sum);


        //Given a list of strings, use the Stream API to collect the unique strings into a set.
        List<String> names = Arrays.asList("Yusuf", "Aliu", "Ahmed", "Kayode", "Jide");
        System.out.println( names.stream().collect(Collectors.toSet()));


        //Given a list of integers, use the Stream API to find the first number that is greater than 3
        System.out.println(mark.stream().filter(n ->n > 3).findFirst());


        //Given a list of strings, use the Stream API to sort the strings in alphabetical order and collect the results into a new list.
        System.out.println(names.stream().sorted().toList());


    }
}
