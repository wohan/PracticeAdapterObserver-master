package state;

/**
 * Created by admin on 05.05.2017.
 */
public class StateNew implements State {
    private String name;
    private String adress;

    public StateNew(String name, String adress) {
        this.name = name;
        this.adress = adress;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public StateNew(String name) {
        this.name = name;
    }

    @Override
    public Object nextState() {
        StateSent stateSent = new StateSent(name, adress);
        return stateSent;
    }
}
