package Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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


    }
}
