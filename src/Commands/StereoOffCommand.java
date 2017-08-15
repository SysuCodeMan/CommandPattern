package Commands;

import Entity.Stereo;

/*
Created by ChrisChan on 2017/8/15.
*/
public class StereoOffCommand implements Command {
    private Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }
}
