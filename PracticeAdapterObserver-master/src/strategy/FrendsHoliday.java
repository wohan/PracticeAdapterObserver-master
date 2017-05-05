package strategy;

/**
 * Created by admin on 05.05.2017.
 */
public class FrendsHoliday implements HolidayStrategy {
    @Override
    public void celebrate() {
        System.out.println("Frends Holiday");
    }
}
