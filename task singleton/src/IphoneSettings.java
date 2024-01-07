public class IphoneSettings {
    private static IphoneSettings instance;
    private int brightness;
    private boolean wifi;

    private IphoneSettings() {

    }

    public static IphoneSettings getInstance() {
        if (instance == null) {
            instance = new IphoneSettings();
        }
        return instance;
    }

    public int getbrightness() {
        return brightness;
    }

    public void setbrightness(int brightness) {
        this.brightness = brightness;
    }

    public void enableWifi(boolean wifi) {
        this.wifi = true;
    }

    public void disableWifi(boolean wifi) {
        this.wifi = false;
    }

    public boolean getwifi() {
        return this.wifi;

    }

}
