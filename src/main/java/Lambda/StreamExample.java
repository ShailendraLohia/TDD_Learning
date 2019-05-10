package Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.*;

public class StreamExample {
    public static void main(String[] args) {
        Stream<String[]> words = Stream.of("Java", "Magazine", "is",
                "the", "best").map(w -> w.split(""));

//        Map<String[], List<String[]>> collect = words.collect(groupingBy(identity()));

        // [J, A, V, A,]
        // M A G A
        Map<String, Long> collect = words.flatMap(Arrays::stream)
                .collect(groupingBy(identity(),counting()));

        System.out.println(collect);

        int[] a = new int[]{1,2,3,4};

        Arrays.stream(a);

    }
}
