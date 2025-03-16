import java.util.ArrayList;
import java.util.List;

public class Device {

    private final String brand;
    private final String model;
    private String color;
    private String osVersion;
    private String memory;
    private String storage;
    private String processor;
    private App activeApp;
    private List<App> openApps = new ArrayList<>();

    public Device(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public Device(String brand, String model, String color, String osVersion, String memory, String storage,
            String processor) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.osVersion = osVersion;
        this.memory = memory;
        this.storage = storage;
        this.processor = processor;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public void powerOn() {
        System.out.println("Device is turned on");
    }

    public void powerOff() {
        System.out.println("Device is turned off");
    }

    public void reboot() {
        System.out.println("Device is rebooting");
    }

    public void update() {
        System.out.println("Device is updating");
    }

    public App getActiveApp() {
        return activeApp;
    }

    public void setActiveApp(App activeApp) {
        this.activeApp = activeApp;
    }

    public void openApp(App app) {
        app.Open();
    }

    public void closeApp(App app) {
        app.Close();
    }

    public void appAdd(App app) {
        openApps.add(app);
    }

    public void appRemove(App app) {
        openApps.remove(app);
        if (openApps.size() > 0)
            setActiveApp(openApps.get(openApps.size() - 1));
        else
            setActiveApp(null);
    }

    public boolean isAppOpen(App app) {
        return openApps.contains(app);
    }

}
