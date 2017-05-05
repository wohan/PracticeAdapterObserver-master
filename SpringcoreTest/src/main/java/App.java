import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by admin on 30.04.2017.
 */
//@Component ("app")
public class App {
    //@Autowired
    private Client client;// = new Client();
    //@Autowired
    private ConsoleEventLogger consoleEventLogger; // = new ConsoleEventLogger();
    //@Autowired
    public Event event;

    public App(Client client, ConsoleEventLogger consoleEventLogger) {
        this.client = client;
        this.consoleEventLogger = consoleEventLogger;
    }

    public App() {
    }

    public static void main(String[] args) {


    ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");


        App app = (App) context.getBean("app");


        app.event = (Event) context.getBean("event");

        app.event.setMsg("Vitya vihodi!");

        app.client.setName("Vasia");
        app.client.setId("1");
        app.consoleEventLogger.outEvent(app.event);
    }
}





