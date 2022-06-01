package stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamExample04 {
    public static void main(String[] args) {
        Stream<String[]> strArrStrm = Stream.of(new String[]{"abc", "def", "ghi"},
                new String[]{"ABC", "GHI", "JKL"});

        Stream<String> stringStream = strArrStrm.flatMap(Arrays::stream);
//        Stream<String> stringStream = strArrStrm.flatMap(arr->Arrays.stream(arr));

        stringStream.map(String::toLowerCase)
                .distinct()
                .sorted()
                .forEach(System.out::println);

        String[] lineArr = {
                "Believe or  not It  is true",
                "Do or do  not There is  no try"
        };

        Stream<String> lineStream = Arrays.stream(lineArr);
        lineStream.flatMap(line -> Stream.of(line.split(" +")))//정규식 : 하나 이상의 공백
                .map(String::toLowerCase)
                .distinct()
                .sorted()
                .forEach(System.out::println);
    }
}
