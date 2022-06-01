package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample01 {
    public static void main(String[] args) {
        //컬렉션 스트림
        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5);
        Stream<Integer> stream = intList.stream(); //list로부터 Stream을 생성
        stream.forEach(System.out::println); //순회하며 모두 출력

        Stream<String> strStream1 = Stream.of("a", "b", "c");
        Stream<String> strStream2 = Stream.of(new String[]{"a", "b", "c"});
        Stream<String> strStream3 = Arrays.stream(new String[]{"a", "b", "c"});
        strStream1.forEach(System.out::println);

        //기본형 스트림
        int[] intArr = {1, 2, 3, 4, 5};
        IntStream intStream1 = Arrays.stream(intArr);
        IntStream intStream2 = Arrays.stream(intArr, 0, 3);
        intStream1.forEach(System.out::println);

        Integer[] intArr2 = new Integer[]{1, 2, 3, 4, 5};
        Stream<Integer> stream1 = Arrays.stream(intArr2);
        stream1.forEach(System.out::println);

        //임의의 스트림
        IntStream intStream = new Random().ints(1, 6);
        long start = System.currentTimeMillis();
        intStream.distinct().limit(5).forEach(i -> System.out.print(i + ","));
        long end = System.currentTimeMillis();
        System.out.println("(end-start) = " + (end-start));

        //람다식 스트림
        Stream<Integer> iterate = Stream.iterate(0, x -> x+2);
        iterate.limit(5).forEach(System.out::println);

        Stream<Integer> generate = Stream.generate(()->1);
        generate.limit(5).forEach(System.out::println);
    }
}
