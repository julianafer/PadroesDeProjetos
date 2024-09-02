public class AdvancedRemote extends BasicRemote {

    AdvancedRemote(Device device){
        super(device);
    }

    public void mute(){
        super.device.setVolume(0);
    }
}
