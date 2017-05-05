package strategy;

/**
 * Created by admin on 05.05.2017.
 */
public class Context {

    private HolidayStrategy strategy ;
    private boolean hasFamily;
    private boolean hasFrends;
    private int cash;

    public void setHasFamily(boolean hasFamily) {
        this.hasFamily = hasFamily;
    }

    public void setHasFrends(boolean hasFrends) {
        this.hasFrends = hasFrends;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    public void celebrate(){
        if(hasFamily){
            strategy = new FamilyHoliday();
            strategy.celebrate();
        } else if (hasFrends&& cash > 5000) {
            strategy = new FrendsHoliday();
            strategy.celebrate();
        } else {
            strategy = new ForeverAlongHolyday();
            strategy.celebrate();
        }
    }
}
