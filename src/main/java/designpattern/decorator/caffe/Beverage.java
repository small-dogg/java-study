package designpattern.decorator.caffe;

public abstract class Beverage {
    String description = "이름 없음";

    public String getDescription() {
        return description;
    }

    abstract long cost();
}
