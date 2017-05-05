import javafx.scene.chart.PieChart;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.Random;

/**
 * Created by admin on 30.04.2017.
 */
//@Component ("event")
public class Event {
    private int id = (new Random()).nextInt();
    private String msg;
    private Date date;// = new Date((new Date().getTime()));

    public Event() {
    }

    public Event(String msg) {
        this.msg = msg;

    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getMsg() {

        return msg;
    }

    public String toString (){
        return id + msg + date;
    }
}
