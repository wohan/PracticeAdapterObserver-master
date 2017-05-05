package chaim;

/**
 * Created by admin on 05.05.2017.
 */
public class InternetRumors extends Rumor {
private boolean connect = true;

    public void setConnect(boolean connect) {
        this.connect = connect;
    }

    @Override
    public void obc() {
        if(!connect){
            System.out.println("Stop connect, Rumors- stop!");
            return;
        }
        System.out.println("Internet said");
        super.obc();
    }
}
