package Lambda;

import java.util.Arrays;
import java.util.List;

public class IntegerStreamExample {
    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(10,9,75,11);

        // Find max element
        System.out.println(list.stream().mapToInt(v->v).max()); //TODO why need to use mapToInt function when list is Integer type

        // Find even number
        System.out.println(list.stream().mapToInt(value -> value)
                .filter(value -> value%2==0)
                .findAny());

        System.out.println(list.stream().map(Integer::valueOf) // Integer::valueOf - Example of static method reference.
                .filter(value -> value%2==0)
                .findAny());

        //Reduce function example method reference with two paramenters
        System.out.println(list.stream()
                                .reduce(
                                0,(total,e)-> Integer.sum(total,e)
        ));

        //Another way to use
        System.out.println(list.stream().reduce(
                0,Integer::sum
        ));

        //Another way to use
        System.out.println(list.stream()
                .map(String::valueOf)
                .reduce(
                "",(carry,str) -> carry.concat(str)
        ));

        System.out.println(list.stream()
                .map(String::valueOf)
                .reduce(
                        "",String::concat
                ));


    }
}
