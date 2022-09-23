package codingtest.tip;

public class 최대공약수최대공배수 {
    static int gdc(int a, int b) {
        if (a < b) {
            int temp = a;
            a = b;
            b = temp;
        }
        while (b != 0) {
            int r=a%b;
            a=b;
            b=r;
        }
        return a;
    }

    static int lcm(int a, int b){
        return a*b / gdc(a,b);
    }
}
