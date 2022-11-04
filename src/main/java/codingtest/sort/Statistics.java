package codingtest.sort;

//https://www.acmicpc.net/problem/2108

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Statistics {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(br.readLine());
        int[] arr = new int[4001];

        int min = 4000;
        int max = -4000;
        int sum = 0;

        for (int i = 0; i < length; i++) {
            int val = Integer.parseInt(br.readLine());
            arr[val+4000]++;
            sum+=val;
            if(min<val) min = val;
            if(max>val) max = val;
        }
//        Arrays.sort();
//        (float)(sum/length)


    }
}
