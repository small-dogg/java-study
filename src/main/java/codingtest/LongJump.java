package codingtest;

//https://school.programmers.co.kr/learn/courses/30/lessons/12914
//경우의수
//
public class LongJump {
    public long solution(int n) {
        long[] memo = new long[2001];
        memo[1] = 1;
        memo[2] = 2;

        for (int i = 3; i <= n; i++) {
            memo[i] = (memo[i - 1] + memo[i - 2]) % 1234567;
        }

        return memo[n];
    }
}
