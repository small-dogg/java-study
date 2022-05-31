package thread.resturant;

import java.util.ArrayList;
import java.util.List;

public class Table {
    public String[] dishNames = {"burger", "donut", "donut"};
    final int MAX_FOOD = 6;
    private List<String> dishes = new ArrayList<>();
    public synchronized void add(String dish) {
        while (dishes.size() >= MAX_FOOD) {
            String name = Thread.currentThread().getName();
            System.out.println(name + " is waiting");
            try {
                wait(); // 음식이 가득찼으니 요리사는 쉬겠습니다
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }
        }
        dishes.add(dish);
        notify(); // 손님 음식 다됐어요~
        System.out.println("Dishes:" + dishes.toString());
    }

    public final void remove(String dishName) {
        synchronized (this) {
            String name = Thread.currentThread().getName();

            while (dishes.size() == 0) {
                System.out.println(name + " is waiting.");
                try {
                    wait(); //음식이 없어요 손님.
                    Thread.sleep(500);


                } catch (InterruptedException e) {
                }
            }

            while (true) {
                for (int i = 0; i < dishes.size(); i++) {
                    if (dishName.equals(dishes.get(i))) {
                        dishes.remove(i);
                        notify(); // 요리 다먹었어요 또만들어주세요
                        return;
                    }
                }

                try {
                    System.out.println(name + " is waiting.");
                    wait(); // 음식이 없네요 기다려주세요.
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }
            }

        }
    }

    public int dishNum() {
        return dishNames.length;
    }
}