package Controller;

import Commands.Command;

/*
Created by ChrisChan on 2017/8/13.
*/
public class SimpleRemoteController {
    Command slot;

    public SimpleRemoteController(){};

    public void setCommand(Command command) {
        slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
