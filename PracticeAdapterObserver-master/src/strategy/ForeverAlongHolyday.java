package strategy;

/**
 * Created by admin on 05.05.2017.
 */
public class ForeverAlongHolyday implements HolidayStrategy {
    @Override
    public void celebrate() {
        System.out.println("No good");
    }
}
