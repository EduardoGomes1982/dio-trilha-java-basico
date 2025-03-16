public class Dialer implements App {

    private Device device;

    public Dialer(Device device) {
        this.device = device;
        device.setActiveApp(this);
    }

    @Override
    public void Open() {
        device.setActiveApp(this);
        device.appAdd(this);
        String deviceDescription = device.getBrand() + " " + device.getModel() + " " + device.getOsVersion();
        System.out.println("Dialer app is open on " + deviceDescription);
    }

    @Override
    public void Close() {
        device.appRemove(this);
        System.out.println("Dialer app is closed");
    }

    @Override
    public void Update() {
        System.out.println("Dialer app is updating");
    }

    @Override
    public String versionCheck() {
        return "Dialer app version is 1.0";
    }

    public void call(String number) {
        System.out.println("Calling " + number);
    }

    public void answer() {
        System.out.println("Answering the call");
    }

    public void hangup() {
        System.out.println("Hanging up the call");
    }

    public void openVoicemail() {
        System.out.println("Opening voicemail");
    }

}
