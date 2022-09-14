package codingtest;

import java.util.Arrays;
import java.util.Comparator;

public class IntegerDescending {
    public long solution(long n) {
        long answer = 0;
        char[] charArr = Long.toString(n).toCharArray();
        Integer[] intArr = new Integer[charArr.length];
        for(int i=0; i<charArr.length-1; i++){
            intArr[i] = Character.getNumericValue(charArr[i]);
        }
        Arrays.sort(intArr, Comparator.reverseOrder());
        return answer;
    }

    public static void main(String[] args) {
        new IntegerDescending().solution(193473);
    }
}
