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
        int[] arr = new int[length];
        int[] counting = new int[8001];
        int[] sorted = new int[length];

        int min = 4000;
        int max = -4000;
        int sum = 0;

        for (int i = 0; i < length; i++) {
            int val = Integer.parseInt(br.readLine());
            arr[i]=val;
            sum+=val;
            if(min>val) min = val;
            if(max<val) max = val;
        }

        for (int i : arr) {
            counting[i+4000]++;
        }

        for (int i = 1; i < counting.length; i++) {
            counting[i]+=counting[i-1];
        }

        int mode = -4000;
        boolean flag = false;
        for (int i = 0; i < counting.length; i++) {
            if(mode < counting[i]-4000) {
                mode = i-4000;
                flag = true;
            }

            else if(mode == counting[i]-4000 && flag) {
                mode = i-4000;
                flag = false;
            }
        }


        for (int i = arr.length-1; i >= 0; i--) {
            sorted[counting[arr[i]+4000]-1]=arr[i];
            counting[arr[i]+4000]--;
        }

        int avg = Math.round(sum / length);
        int mid = sorted[(sorted.length-1) / 2];
        int range = sorted[sorted.length - 1] - sorted[0];

        System.out.println("avg = " + avg);
        System.out.println("mid = " + mid);
        System.out.println("mode = " + mode);
        System.out.println("range = " + range);
    }
}
