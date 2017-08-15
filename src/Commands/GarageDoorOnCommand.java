package Commands;

import Entity.GarageDoor;

/*
Created by ChrisChan on 2017/8/15.
*/
public class GarageDoorOnCommand implements Command {
    private GarageDoor garageDoor;

    public GarageDoorOnCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.on();
    }
}
