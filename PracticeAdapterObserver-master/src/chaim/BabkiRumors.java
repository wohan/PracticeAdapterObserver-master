package chaim;

/**
 * Created by admin on 05.05.2017.
 */
public class BabkiRumors extends Rumor {
    private boolean isLife = true;

    public void setLife(boolean life) {
        isLife = life;
    }

    @Override
    public void obc() {
        if(!isLife){
            System.out.println("Babka is dead");
            return;
        }
        System.out.println("Babka said");
        super.obc();
    }
}
