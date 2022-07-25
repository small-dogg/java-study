package designpattern.simuduck;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 컴포지트 패턴과 반복자 패턴
 */
public class Flock implements Quackable{
    List<Quackable> quackers = new ArrayList<>();

    public void add(Quackable quacker) {
        quackers.add(quacker);
    }

    @Override
    public void quack() {
        Iterator<Quackable> iterator = quackers.iterator();
        while (iterator.hasNext()) {
            Quackable quacker = iterator.next();
            quacker.quack();
        }
    }

    @Override
    public void registerObserver(Observer observer) {

    }

    @Override
    public void notifyObservers() {

    }
}
