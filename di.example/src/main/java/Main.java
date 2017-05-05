import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by PoGo on 25.04.2017.
 */
public class Main {

    private static Downloader downloader;
    private static Uploader uploader;

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

        downloader = (Downloader) applicationContext.getBean("downloader");
        uploader = (Uploader) applicationContext.getBean("uploader");

        String content = downloader.download("/path");
        uploader.upload(content);
    }
}
