package codingtest.baekjoon.conditionalstatement;

import java.util.Scanner;

//https://www.acmicpc.net/problem/9498

public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 70) {
            System.out.println("C");
        } else if (score >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

        //BufferedReader 를 쓰는 방법도 있음
    }
}
