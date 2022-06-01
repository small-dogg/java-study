package stream;

import java.io.File;
import java.util.stream.Stream;

public class StreamExample03 {
    public static void main(String[] args) {
        File[] fileArr = new File[]{new File("Ex1.java"), new File("Ex1"),
                new File("Ex1.bak"), new File("Ex2.java"), new File("Ex1.txt")};

        Stream<File> fileStream = Stream.of(fileArr);
        fileStream.map(File::getName)
                .filter(s-> s.indexOf('.')!=-1)
                .peek(System.out::println)
                .map(s->s.substring(s.indexOf('.')+1))
                .peek(System.out::println)
                .map(String::toUpperCase)
                .peek(System.out::println)
                .distinct()
                .forEach(System.out::print);
    }
}
