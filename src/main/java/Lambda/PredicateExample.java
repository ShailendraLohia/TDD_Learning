package Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(10,89,34,15,84);

        Predicate<Integer> evenNumber= (number)-> number%2==0;

        list.stream()
            .filter(evenNumber)
            .sorted()
            //.mapToInt(num->num)
            .forEach(System.out::println);
    }
}
