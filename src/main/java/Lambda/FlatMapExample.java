package Lambda;

import java.util.*;
import java.util.stream.Collectors;

public class FlatMapExample {
    public static void main(String[] args) {
        String[][] data = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}};
        Arrays.stream(data)
                .flatMap(x->Arrays.stream(x))
                .forEach(System.out::println);

        System.out.println(
            Arrays.stream(data)
                .flatMap(x->Arrays.stream(x))
                .reduce("",String::concat));



        List<List<Person>> listList= new ArrayList<>();

        List<Person> people= Arrays.asList(
                new Person("Ted","Neward",41),
                new Person("Ted","Neward",45),
                new Person("Charlote","Neward",41),
                new Person("Michael","Neward",19),
                new Person("Matthew","Neward",13)
        );
        listList.add(people);

        System.out.println(
            listList.stream()
                .flatMap(x->x.stream())
                .collect(Collectors.groupingBy(Person::getFirstName)));

        // Get the map to be flattened.
        Map<Integer, List<Integer> > map = new HashMap<>();
        map.put(1, Arrays.asList(1, 2));
        map.put(2, Arrays.asList(3, 4, 5, 6));
        map.put(3, Arrays.asList(7, 8, 9));


        map.entrySet().stream()
                .map(x->x.getValue())
                .flatMap(x->x.stream())
                .forEach(System.out::println);

        System.out.println(
                map.entrySet().stream()
                    .map(x->x.getValue())
                    .flatMap(x->x.stream())
                    .map(String::valueOf)
                    .reduce(" ",String::concat)
        );

    }
}
