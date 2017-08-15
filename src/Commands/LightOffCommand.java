package Commands;

import Entity.Light;

/*
Created by ChrisChan on 2017/8/14.
*/
public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
