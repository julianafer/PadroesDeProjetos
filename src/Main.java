public class Main {
    public static void testDevice(Device device) {
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        basicRemote.channelUp();
        basicRemote.volumeUp();
        device.printStatus();

        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.mute();
        device.printStatus();
    }

    public static void main(String[] args) {
        System.out.println(">>> Starting TV Test <<<");
        testDevice(new TV());

        System.out.println("\n*************************");

        System.out.println(">>> Starting Digital Radio Test <<<");
        testDevice(new DigitalRadio("FM"));
    }

}