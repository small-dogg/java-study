package designpattern.observer.weatherstation;

public class AverageDisplay implements Observer, DisplayElement{
    private WeatherData weatherData;

    public AverageDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
    }

    @Override
    public void update() {

    }

    @Override
    public void display() {
        System.out.println("평균/최고/최저 온도 = ");
    }
}
