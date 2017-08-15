package Commands;

import Entity.Light;

/*
Created by ChrisChan on 2017/8/13.
*/
public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
