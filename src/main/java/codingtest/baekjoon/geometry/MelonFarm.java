package codingtest.baekjoon.geometry;

//https://www.acmicpc.net/problem/2477

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MelonFarm {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int melon = Integer.parseInt(br.readLine());

        int xMax = 0;
        int yMax = 0;

        for (int i = 0; i < 6; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int val = Integer.parseInt(st.nextToken());
            if(x==1||x==2) {
                if (val > yMax) yMax = val;
            }else{
                if (val > xMax) xMax = val;
            }
        }

    }
}
