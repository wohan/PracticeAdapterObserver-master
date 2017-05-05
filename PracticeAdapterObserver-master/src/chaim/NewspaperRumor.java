package chaim;

/**
 * Created by admin on 05.05.2017.
 */
public class NewspaperRumor extends Rumor {
    private long belance = 0;

    public void setBelance(long belance) {
        this.belance = belance;
    }

    @Override
    public void obc() {
        if (belance > 10000) {
            System.out.println("Rumor not true");
            return;
        }
        System.out.println("Newspaper said");
        super.obc();

    }
}
