package state;

import java.io.PrintWriter;

/**
 * Created by admin on 05.05.2017.
 */
public class StateSent extends StateNew {
    public String whoSigns;
    public String name;
    public String adress;

    public StateSent(String name, String adress) {
        super(name, adress);
    }


    public void setWhoSigns(String whoSigns) {
        this.whoSigns = whoSigns;
    }

    @Override
    public Object nextState() {
        StateSigned stateSigned = new StateSigned(name, whoSigns);
        return stateSigned;
    }
}
