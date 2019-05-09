package Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.toList;

public class GroupByExample {
    public static void main(String[] args) {
        List<Person> people= Arrays.asList(
                new Person("Ted","Neward",41),
                new Person("Ted","Neward",45),
                new Person("Charlote","Neward",41),
                new Person("Michael","Neward",19),
                new Person("Matthew","Neward",13)
        );

        System.out.println(
                people.stream()
                      .collect(Collectors.groupingBy(Person::getFirstName))
        );

        System.out.println(
                people.stream()
                      .collect(Collectors.groupingBy(Person::getFirstName,
                              mapping(Person::getAge,toList())))
        );
    }
}
