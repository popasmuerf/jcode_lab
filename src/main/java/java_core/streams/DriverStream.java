package java_core.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * Created by mdb on 4/15/18.
 */
public class DriverStream {

    public static void main(String[] args){
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        List<String> filtered = strings.stream().filter(string ->
            !string.isEmpty())
                .collect(Collectors
                        .toList()
        );


        Random random = new Random() ;
        random.ints().limit(10).forEach(System.out::println);


        List<Integer> numbers  = Arrays.asList(3,2,2,3,7,3,5);





    }
}
