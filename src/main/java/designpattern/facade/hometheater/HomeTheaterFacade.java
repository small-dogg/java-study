package designpattern.facade.hometheater;

public class HomeTheaterFacade {
    Amplifier amp;
    StreamingPlayer player;
    Projector projector;
    TheaterLights lights;
    Screen screen;

    public HomeTheaterFacade(Amplifier amp, StreamingPlayer player, Projector projector, TheaterLights lights, Screen screen) {
        this.amp = amp;
        this.player = player;
        this.projector = projector;
        this.lights = lights;
        this.screen = screen;
    }

    public void movieMode(){
        amp.on();
        lights.dim(10);
        screen.down();
        projector.on();
    }

    public void allStop(){
        amp.off();
        lights.on();
        screen.up();
        projector.off();
    }
}
