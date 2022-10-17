package codingtest.tip;

public class 소수여부 {
    public int isPrime(int n) {
        for (int i = 2; i <= (int) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return 0;
            }
        }
        return 1;
    }
}
