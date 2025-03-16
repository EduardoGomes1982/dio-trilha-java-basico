public class Player implements App {

    private Device device;

    public Player(Device device) {
        this.device = device;
        device.setActiveApp(this);
    }

    @Override
    public void Open() {
        device.setActiveApp(this);
        device.appAdd(this);
        String deviceDescription = device.getBrand() + " " + device.getModel() + " " + device.getOsVersion();
        System.out.println("Player app is open on " + deviceDescription);
    }

    @Override
    public void Close() {
        device.appRemove(this);
        System.out.println("Player app is closed");
    }

    @Override
    public void Update() {
        System.out.println("Player app is updating");
    }

    @Override
    public String versionCheck() {
        return "Player app version is 1.0";
    }

    public void play() {
        System.out.println("Playing the media");
    }

    public void pause() {
        System.out.println("Pausing the media");
    }

    public void stop() {
        System.out.println("Stopping the media");
    }

    public void rewind() {
        System.out.println("Rewinding the media");
    }

    public void fastForward() {
        System.out.println("Fast forwarding the media");
    }

    public void next() {
        System.out.println("Playing the next media");
    }

    public void previous() {
        System.out.println("Playing the previous media");
    }

    public void mute() {
        System.out.println("Muting the media");
    }

    public void unmute() {
        System.out.println("Unmuting the media");
    }

    public void setVolume(int volume) {
        System.out.println("Setting volume to " + volume);
    }

    public void setSubtitle(String subtitle) {
        System.out.println("Setting subtitle to " + subtitle);
    }

}
