package stream;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample05 {
    public static void main(String[] args) {
        String[] strArr = {
                "Inheritance", "Java", "Lamda", "Stream",
                "OptionalDouble", "IntStream", "count", "sum"
        };

        Stream.of(strArr).forEach(System.out::println);

        //strArr에서 길이가 0인 요소가 하나도 없냐?
        boolean none = Stream.of(strArr).noneMatch(s -> s.length() == 0);

        System.out.println("b = " + none);

        //strArr에서 첫번째 캐릭터가 s로 시작하는 첫번째 찾기
        //find는 filter와 보편적으로 함께 사용하고
        //Optional로 반환한다.
        Optional<String> first = Stream.of(strArr).filter(s -> s.charAt(0) == 's').findFirst();
        System.out.println("first = " + first);

//        IntStream intStream1 = Stream.of(strArr).mapToInt(s->s.length());
        IntStream intStream1 = Stream.of(strArr).mapToInt(String::length);
        IntStream intStream2 = Stream.of(strArr).mapToInt(String::length);
        IntStream intStream3 = Stream.of(strArr).mapToInt(String::length);
        IntStream intStream4 = Stream.of(strArr).mapToInt(String::length);

        //count
        int count = intStream1.reduce(0, (a, b) -> a + 1);
        //sum
        int sum = intStream1.reduce(0, (a, b) -> a + b);
        System.out.println("count = " + count);
        System.out.println("sum = " + sum);


        //max
        intStream1.reduce(Integer.MAX_VALUE, (a, b) -> a > b ? a : b);
        OptionalInt max = intStream1.reduce(Integer::max);


        //min
        intStream1.reduce(Integer.MAX_VALUE, (a, b) -> a < b ? a : b);
        OptionalInt min = intStream1.reduce(Integer::min);

        System.out.println("max.orElse(0) = " + max.orElse(0));
        System.out.println("min.orElseGet(()->0) = " + min.orElseGet(() -> 0));
    }
}
