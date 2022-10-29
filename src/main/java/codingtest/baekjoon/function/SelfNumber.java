package codingtest.baekjoon.function;

//https://www.acmicpc.net/problem/4673

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class SelfNumber {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        boolean[] ints = new boolean[10000];
        for (int i = 0; i < 10000; i++) {
            char[] chars = String.valueOf(i).toCharArray();
            int sum = 0;
            for (char aChar : chars) {
                sum+=Integer.parseInt(String.valueOf(aChar));
            }
            if(sum+i>=10000) break;
            ints[sum+i] = true;
        }
        for (int i = 0; i < ints.length; i++) {
            if (ints[i]) {
                bw.write(String.valueOf(i+1));
                bw.newLine();
            }
        }
        bw.flush();
        bw.close();
    }
}
