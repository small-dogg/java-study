package codingtest.book.정렬;

import java.util.Arrays;
import java.util.stream.Collectors;

public class 가장큰수 {
    public String solution(int[] numbers) {
        return Arrays.stream(numbers)
                .mapToObj(String::valueOf) // numbers 를 모두 String으로 변환
                .sorted((s1, s2) -> {
                    int original = Integer.parseInt(s1 + s2);
                    int reverse = Integer.parseInt(s2 + s1);
                    return reverse - original;
                })
                .collect(Collectors.joining(""))
                .replaceAll("^0+", "0");

//        String[] str = new String[numbers.length];
//
//        for (int i = 0; i < numbers.length; i++) {
//            str[i]=String.valueOf(numbers[i]);
//        }
//
//        Arrays.sort(str, (o1, o2) -> (o2+o1).compareTo(o1+o2));
//
//        if(str[0].equals("0"))return "0";
//
//        StringBuilder sb = new StringBuilder();
//        for (String s : str) {
//            sb.append(s);
//        }
//        return sb.toString();
    }
}
