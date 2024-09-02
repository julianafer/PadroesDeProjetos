public class DigitalRadio extends Device{
    private String modulation;

    DigitalRadio(String modulation){
        this.modulation = modulation;
    }

    DigitalRadio(){}

    public String getModulation() {
        return modulation;
    }

    public void setModulation(String modulation) {
        this.modulation = modulation;
    }

    @Override
    public void printStatus() {
        System.out.println("************************************");
        System.out.println("*  Status Report: Digital Radio    *");
        System.out.println("*----------------------------------*");
        System.out.println("*  State   : " + (super.isEnabled() ? "ENABLED" : "DISABLED"));
        System.out.println("*  Volume  : " + super.getVolume() + "%");
        System.out.println("*  Channel : " + super.getChannel());
        System.out.println("*  Modulation: " + modulation);
        System.out.println("************************************\n");
    }
}
