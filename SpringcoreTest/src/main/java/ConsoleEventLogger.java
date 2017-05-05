import org.springframework.stereotype.Component;

/**
 * Created by admin on 30.04.2017.
 */
//@Component("consoleEventLogger")
public class ConsoleEventLogger {


    public void outEvent (Event event){
//        Client client = new Client();
//        String msg = event.replaceAll(client.getId(), client.getName());
        System.out.println(event.toString());
    }
}
