package codingtest;

public class FiboNum {
    public int solution(int n) {
        int answer = 0;
        for (int i = n-2; i < n; i++) {
            answer+=fibo(i);
        }
        return answer%1234567;
    }

    public static int fibo(int n) {
        if (n <= 1) return n;
        else return fibo(n - 2) + fibo(n - 1);
    }

    public static void main(String[] args) {
        new FiboNum().solution(100000);
    }
}
