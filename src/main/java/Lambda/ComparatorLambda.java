package Lambda;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorLambda {
    public static void main(String[] args) {
        Comparator<String> c= (String lhs, String rhs) ->
        {
            System.out.println("I am comparing " + lhs + " to " + rhs);
            return lhs.compareTo(rhs);
        };
        int result=c.compare("hello", "world");

        // Array sorting

        Person[] people=new Person[] {
                new Person("Ted","Neward",41),
                new Person("Charlote","Neward",41),
                new Person("Michael","Neward",19),
                new Person("Matthew","Neward",13)
        };
        Arrays.sort(people,(lhs,rhs) ->lhs.getFirstName().compareTo(rhs.getFirstName()));

        for(Person p: people) {
            System.out.println(p);
        }

    }
}
