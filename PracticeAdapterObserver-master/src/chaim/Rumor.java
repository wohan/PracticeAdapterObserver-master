package chaim;

/**
 * Created by admin on 05.05.2017.
 */
public abstract class Rumor {
    private Rumor rumor;
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public void setRumor(Rumor rumor) {
        this.rumor = rumor;
    }

    public void obc(){
        System.out.println(message);
        if (rumor!=null){
            rumor.message = message;

            rumor.obc();
        }

    }

}