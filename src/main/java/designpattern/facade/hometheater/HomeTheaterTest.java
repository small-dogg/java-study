package designpattern.facade.hometheater;

public class HomeTheaterTest {
    public static void main(String[] args) {
        Amplifier amplifier = new Amplifier();
        Projector projector = new Projector();
        Screen screen = new Screen();
        TheaterLights theaterLights = new TheaterLights();
        StreamingPlayer streamingPlayer = new StreamingPlayer();

        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(amplifier,streamingPlayer,projector,theaterLights,screen);

        homeTheaterFacade.movieMode();

        homeTheaterFacade.allStop();
    }
}
