package codingtest.tip;

public class 에라토스테네스의체 {
    public static void make_prime(int N) {

        boolean[] prime = new boolean[N + 1];	// 0 ~ N

		/*
		소수가 아닌 index = true
		소수인 index = false
		*/

        // 2 미만의 N 을 입력받으면 소수는 판별할 필요 없으므로 바로 return
        if(N < 2) {
            return;
        }

        prime[0] = prime[1] = true;


        // 제곱근 함수 : Math.sqrt()
        for(int i = 2; i <= Math.sqrt(N); i++) {

            // 이미 체크된 배열이면 다음 반복문으로 skip
            if(prime[i] == true) {
                continue;
            }

            // i 의 배수들을 걸러주기 위한 반복문
            for(int j = i * i; j < prime.length; j = j+i) {
                prime[j] = true;
            }
        }

    }
}
