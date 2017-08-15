package Commands;

import Entity.GarageDoor;

/*
Created by ChrisChan on 2017/8/15.
*/
public class GarageDoorOffCommand implements Command {
    private GarageDoor garageDoor;

    public GarageDoorOffCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.off();
    }
}
