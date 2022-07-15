package designpattern.templatemethod.starbuzz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoffeeWithHook extends CaffeineBeverageWithHook {

    @Override
    void brew() {
        System.out.println("필터로 커피를 우려내는 중");
    }

    @Override
    void addCondiments() {
        System.out.println("설탕과 우유를 추가하는 중");
    }

    @Override
    boolean hook() {
        return getUserInput().equalsIgnoreCase("y");
    }

    private String getUserInput() {
        String answer = null;
        System.out.println("설탕을 좀더 추가하시겠습니까? (y/n)");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (IOException e) {
            System.out.println("I/O Error");
        }
        if (answer == null) {
            return "no";
        }
        return answer;
    }
}
