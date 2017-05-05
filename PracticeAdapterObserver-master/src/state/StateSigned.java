package state;

/**
 * Created by admin on 05.05.2017.
 */
public class StateSigned extends StateSent {

    private boolean signature; // подписан или нет

    public StateSigned(String name, String whoSigns) {
        super(name, whoSigns);
    }

    public void setSignature(boolean signature) {
        this.signature = signature;
    }

    @Override
    public Object nextState() {
        if (signature) {
        StateWaiting stateWaiting =new StateWaiting();
        } else {
            StateNew stateNew = new StateNew(super.name, super.name);
            return stateNew;
        }
        return null;
    }
}
