public class BasicRemote {
    public Device device;

    BasicRemote(Device device) {
        this.device = device;
    }

    BasicRemote() {}

    public void power(){
        if (device.isEnabled()){
            device.disable();
        } else {
            device.enable();
        }
    }

    public void volumeDown(){
        if (device.isEnabled()){
            device.setVolume(device.getVolume() - 1);
        }
    }

    public void volumeUp(){
        if (device.isEnabled()){
            device.setVolume(device.getVolume() + 1);
        }
    }

    public void channelDown(){
        if (device.isEnabled()){
            device.setChannel(device.getChannel() - 1);
        }
    }

    public void channelUp(){
        if (device.isEnabled()){
            device.setChannel(device.getChannel() + 1);
        }
    }
}
