package chaim;

/**
 * Created by admin on 05.05.2017.
 */
public class Main {
    public static void main(String[] args) {
        BabkiRumors babkiRumors = new BabkiRumors();
        babkiRumors.setMessage("Strings are very poppulary in Innopolise");
        NewspaperRumor newspaperRumor = new NewspaperRumor();
        InternetRumors internetRumors = new InternetRumors();
        newspaperRumor.setBelance(11000L);
        babkiRumors.setRumor(newspaperRumor);
        newspaperRumor.setRumor(internetRumors);
        babkiRumors.obc();
        internetRumors.setConnect(false);
        babkiRumors.setLife(false);
    }
}
