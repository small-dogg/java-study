package codingtest.baekjoon.onedimensionalarray;

//https://www.acmicpc.net/problem/2562

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Max {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int idx = 0;
        int max = 0;
        for (int i = 1; i <= 9; i++) {
            int val = Integer.parseInt(br.readLine());
            if (val > max) {
                max = val;
                idx = i;
            }
        }
        System.out.println(max+"\n"+idx);
    }
}
