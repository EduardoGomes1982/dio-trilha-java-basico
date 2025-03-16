public class Navigator implements App {

    private Device device;

    public Navigator(Device device) {
        this.device = device;
        device.setActiveApp(this);
    }

    @Override
    public void Open() {
        device.setActiveApp(this);
        device.appAdd(this);
        String deviceDescription = device.getBrand() + " " + device.getModel() + " " + device.getOsVersion();
        System.out.println("Navigator app is open on " + deviceDescription);
    }

    @Override
    public void Close() {
        device.appRemove(this);
        System.out.println("Navigator app is closed");
    }

    @Override
    public void Update() {
        System.out.println("Navigator app is updating");
    }

    @Override
    public String versionCheck() {
        return "Navigator app version is 1.0";
    }

    public void navigate(String address) {
        System.out.println("Navigating to " + address);
    }

    public void search(String query) {
        System.out.println("Searching for " + query);
    }

    public void addTab() {
        System.out.println("Adding a new tab");
    }

    public void closeTab() {
        System.out.println("Closing the current tab");
    }

    public void refresh() {
        System.out.println("Refreshing the page");
    }

}
