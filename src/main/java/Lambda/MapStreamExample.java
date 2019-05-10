package Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MapStreamExample {
    public static void main(String[] args) {
        List<Person> people= Arrays.asList(
                new Person("Ted","Neward",41),
                new Person("Charlote","Neward",41),
                new Person("Michael","Neward",19),
                new Person("Matthew","Neward",13)
                );

        System.out.println(
                people.stream()
                      .collect(Collectors.toMap(
                              person-> person.getFirstName() + "-" + person.getAge(),
                              person -> person
                      ))
        );

        String[] arr= {"G", "e", "e", "k", "s"};

        //Geeks For Geeks problem
        //Example of range
        IntStream.range(0,arr.length)
                 .mapToObj(index-> String.format("%d -> %s",index, arr[index]))
                 .forEach(System.out::println);

        // Another way of doing same problem as above
        AtomicInteger index = new AtomicInteger();

        Arrays.stream(arr)
              .map(str-> index.getAndIncrement() + "->" + str)
              .forEach(System.out::println);

        Arrays.stream(arr)
                //.map(str->str)
                .forEach(System.out::println);



    }
}
