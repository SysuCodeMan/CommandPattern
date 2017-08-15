package Entity;

/*
Created by ChrisChan on 2017/8/15.
*/
public class CeilingFan {
    private String location;

    public CeilingFan(String location) {
        this.location = location;
    }

    public void on() {
        System.out.printf(location + " CeilingFan on");
    }

    public void off() {
        System.out.println(location + " CeilingFan off");
    }
}
