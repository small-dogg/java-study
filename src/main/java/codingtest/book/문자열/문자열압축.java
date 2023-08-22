package codingtest.book.문자열;

import java.util.ArrayList;
import java.util.List;

public class 문자열압축 {

    public static void main(String[] args) {
        System.out.println(new 문자열압축().solution("abcabcdede"));
    }

    public List<String> tokenize(String s, int length) {
        ArrayList<String> tokens = new ArrayList<>();

        for (int i = 0; i < s.length(); i += length) {
            int end = i + length;
            if (s.length() < length) {
                end = s.length();
            }
            tokens.add(s.substring(i, end));
        }

        return tokens;
    }

    public int compress(String s, int length) {

        StringBuilder sb = new StringBuilder();

        List<String> tokens = tokenize(s, length);
        String before = "";
        int size = 0;

        for (String token : tokens) {
            if (!before.equals(token)) {
                if(size!=0) {
                    sb.append(size).append(before);
                }else{
                    sb.append(before);
                }
                before = token;
                size = 0;
            } else {
                size++;
            }
        }
        return sb.toString().length();
    }

    public int solution(String s) {
        int min = Integer.MAX_VALUE;

        for (int length = 1; length < s.length(); length++) {
            int compress = compress(s, length);
            if (compress < min) {
                min = compress;
            }
        }

        return min;
    }
}
