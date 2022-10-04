package codingtest;

import java.util.*;

public class LifeBoat {
    public int solution(int[] people, int limit) {
        Arrays.sort(people);
        int sum = 0;
        int max = 0;
        int cnt = 0;
        for (int person : people) {
            if(limit>person+sum&&max!=2){
                sum += person;
                max++;
            }else if(limit == person+sum&&max!=2) {
                sum += person;
                max++;
            }else{
                    cnt++;
                    sum = person;
            }
        }
        return cnt+1;
    }

    public static void main(String[] args) {
        new LifeBoat().solution(new int[]{70,80,50},100);
    }
}
