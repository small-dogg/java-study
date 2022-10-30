package codingtest.basicmath1;

//https://www.acmicpc.net/problem/1193

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindFraction {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int data = Integer.parseInt(br.readLine());

        int i = 1;
        int val = i;
        while (true) {
            i++;
            val+=i;
            if(val>=data){
                int diff = val - data;
                System.out.println(diff+1 + "/" +(data-diff-1));
                System.out.println(val/i);
                System.out.println(val);
                System.out.println(i);
                break;
            }
        }
    }
}
