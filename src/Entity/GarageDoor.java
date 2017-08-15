package Entity;

/*
Created by ChrisChan on 2017/8/15.
*/
public class GarageDoor {
    private String location;

    public GarageDoor(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + " GarageDoor on");
    }

    public void off() {
        System.out.println(location + " GarageDoor off");
    }
}
