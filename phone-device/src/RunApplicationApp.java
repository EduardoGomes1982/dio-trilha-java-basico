public class RunApplicationApp {

    public static void main(String[] args) {
        System.out.println("Running the application");
        Device device = new Device("Samsung", "Galaxy S10", "Black", "Android 9", "8GB", "128GB", "Snapdragon 855");
        device.powerOn();
        Navigator navigator = new Navigator(device);
        navigator.navigate("123 Main St, Springfield, IL");
        navigator.search("restaurants near me");
        navigator.addTab();
        navigator.refresh();
        navigator.closeTab();
        navigator.addTab();
        Dialer dialer = new Dialer(device);
        dialer.call("123-456-7890");
        dialer.hangup();
        dialer.answer();
        dialer.openVoicemail();
        dialer.hangup();
        Player player = new Player(device);
        player.setSubtitle("English");
        player.play();
        player.pause();
        player.stop();
        player.setVolume(50);
        player.play();
        player.stop();
        device.closeApp(player);
        device.closeApp(dialer);
        device.closeApp(navigator);
        device.powerOff();
    }

}
