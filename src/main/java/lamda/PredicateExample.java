package lamda;

import java.util.function.Function;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Function<String, Integer> f = (s) -> Integer.parseInt(s, 16);
        Function<Integer, String> g = (i) -> Integer.toBinaryString(i);

        Function<String, String> h = f.andThen(g); //f 적용한다음에 g를 적용해라
        Function<Integer, Integer> h2 = f.compose(g); //g.andThen(f)와 동일하다

        System.out.println(h.apply("FF")); // "FF" -> 255 (16^2) -> "11111111" (2^8)
        System.out.println(h2.apply(2)); // 2 -> "10"(10진수 2를 2진수 String으로 변환) -> 16(2진수 String 10을 16진수로 변환)

        Function<String, String> f2 = x -> x; // 항등 함수 (identity function)
        System.out.println(f2.apply("AAA")); // AAA가 그대로 출력됨

        Predicate<Integer> p = i -> i < 100;
        Predicate<Integer> q = i -> i < 200;
        Predicate<Integer> r = i -> i%2 == 0;
        Predicate<Integer> notP = p.negate();
        Predicate<Integer> all =  notP.and(q).or(r);

        System.out.println(all.test(150)); // true

        String str1 = "abc";
        String str2 = "abc";
        //str1과 str2가 같은지 비교한 결과 반환
        Predicate<String> p2 = Predicate.isEqual(str1);
        boolean result = p2.test(str2);
        System.out.println("result = " + result);
    }


}
