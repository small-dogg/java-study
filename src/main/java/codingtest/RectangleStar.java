package codingtest;

import java.util.Scanner;

public class RectangleStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int j = 0; j < b; j++) {
            for (int i = 0; i < a; i++) {

                System.out.print("*");
            }
            System.out.println();
        }
    }
}
