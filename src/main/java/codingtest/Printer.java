package codingtest;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Printer {
    public int solution(int[] priorities, int location) {
        int max = 0;
        int maxloc = 0;
        for (int i = 0; i < priorities.length; i++) {
            if(priorities[i]>max){
                max = priorities[i];
                maxloc=i;
            }
        }
        if(maxloc > location){
           return maxloc-location + priorities.length;
        }else if(maxloc < location){
            return location - maxloc;
        }else{
            return 0;
        }

    }

    public static void main(String[] args) {
        new Printer().solution(new int[]{1, 1, 9, 1, 1, 1}, 0);
    }
}
