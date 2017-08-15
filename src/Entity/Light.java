package Entity;

/*
Created by ChrisChan on 2017/8/13.
*/
public class Light {
    private String location;

    public Light(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + " Light on");
    }

    public void off() {
        System.out.println(location + "Light off");
    }
}
