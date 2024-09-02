public abstract class Device {

    private boolean on = false;
    private int volume = 0;
    private int channel = 1;

    public boolean isEnabled(){
        return this.on;
    }

    public void enable(){
        this.on = true;
    }

    public void disable(){
        this.on = false;
    }

    public int getVolume(){
        return this.volume;
    }

    public void setVolume(int volume){
        this.volume = volume;
    }

    public int getChannel(){
        return this.channel;
    }

    public void setChannel(int channel){
        this.channel = channel;
    }

    @Override
    public String toString() {
        return "Device Status:\n" +
                "- Power: " + (on ? "ON" : "OFF") + "\n" +
                "- Volume: " + volume + "%\n" +
                "- Channel: " + channel;
    }

    public abstract void printStatus();
}
