package Test;

import Commands.LightOnCommand;
import Controller.SimpleRemoteController;
import Entity.Light;

/*
Created by ChrisChan on 2017/8/13.
*/
public class RemoteControllerTest {
    public static void main(String[] args) {
        SimpleRemoteController remoteController = new SimpleRemoteController();
        Light light = new Light("");
        LightOnCommand lightOnCommand = new LightOnCommand(light);

        remoteController.setCommand(lightOnCommand);
        remoteController.buttonWasPressed();
    }
}
