package Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Peek {
    public static void main(String[] args) {
        LongStream stream=LongStream.range(2L,10L);
       // long sum=stream.peek(System.out::println).sum();

        //System.out.println("sum is : " + sum);

        OptionalDouble d=stream.peek(System.out::println).average();
        System.out.println(d);


        List<Integer> list2 = Arrays.asList(5, 6, 7);
        int res = list2.parallelStream().reduce(1, (s1, s2) -> s1 * s2, (p, q) -> p * q);
        System.out.println(res);



    }
}
