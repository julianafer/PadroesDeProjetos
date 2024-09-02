public class TV extends Device {
    private boolean smartTv = true;

    public void smartTvOn(){
        super.enable();
    }

    public void smartTvOff(){
        super.disable();
    }

    @Override
    public void printStatus() {
        System.out.println("╔════════════════════════════════════╗");
        System.out.println("║          TV Status Report          ║");
        System.out.println("╠════════════════════════════════════╣");
        System.out.println("║ Power    : " + (super.isEnabled() ? "ENABLED" : "DISABLED") + "                 ║");
        System.out.println("║ Volume   : " + super.getVolume() + "%                      ║");
        System.out.println("║ Channel  : " + super.getChannel() + "                       ║");
        System.out.println("╚════════════════════════════════════╝\n");
    }

}
