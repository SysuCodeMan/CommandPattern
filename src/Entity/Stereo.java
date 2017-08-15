package Entity;

/*
Created by ChrisChan on 2017/8/14.
*/
public class Stereo {

    private String location;

    public Stereo(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println("Stereo on");
    }

    public void off() {
        System.out.println("Stereo off");
    }

    public void setCD() {
        System.out.println("Stereo Set CD");
    }

    public void setVolume(int volume) {
        System.out.println("Stereo volume:" + volume);
    }
}
