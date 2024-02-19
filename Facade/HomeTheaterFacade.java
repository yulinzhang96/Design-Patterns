// The Facade Pattern provides a unified interface to a set of interfaces in a subsystem. Facade defines a higher-level interface that makes the subsystem easier to use.
public class HomeTheaterFacade {
  Amplifier amp;
  Tuner tuner;
  DvdPlayer dvd;
  CdPlayer cd;
  Projector projector;
  TheaterLights lights;
  Screen screen;
  PopcornPopper popper;

  public HomeTheaterFacade(Amplifier amp,
                           Tuner tuner,
                           DvdPlayer dvd,
                           CdPlayer cd,
                           Projector projector,
                           TheaterLights lights,
                           Screen screen,
                           PopcornPopper popper) {
    this.amp = amp;
    this.tuner = tuner;
    this.dvd = dvd;
    this.cd = cd;
    this.projector = projector;
    this.screen = screen;
    this.lights = lights;
    this.popper = popper;
  }

  public void watchMovie(String movie) {
    popper.on();
    popper.pop();
    lights.dim(10);
    screen.down();
    projector.on();
    projector.wideScreenMode();
    amp.on();
    amp.setDvd(dvd);
    amp.setSurroundSound();
    amp.setVolume(5);
    dvd.on();
    dvd.play(movie);
  }

  public void endMovie() {
    popper.off();
    lights.on();
    screen.up();
    projector.off();
    amp.off();
    dvd.stop();
    dvd.eject();
    dvd.off();
  }
}
