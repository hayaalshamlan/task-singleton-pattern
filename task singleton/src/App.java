public class App {
    public static void main(String[] args) throws Exception {
        IphoneSettings iphoneSettings = IphoneSettings.getInstance();

        iphoneSettings.setbrightness(10);
        System.out.println(" brigtness" + iphoneSettings.getbrightness());
        System.out.println("wifi connection " + iphoneSettings.getwifi());

    }
}
