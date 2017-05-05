/**
 * Created by admin on 25.04.2017.
 */
public class main {
    private static  DownLoader downLoader;
    private static UpLoader upLoader;

    public static void main(String[] args) {
        AplicationContext context = new ClassPathXmlAplicationContext();
        downLoader = ()context.getBean("uploader");
       downLoader = new HttpDownloader();
       upLoader = new HttpUploader();
       String content = downLoader.download("");
       upLoader.upload(content);

    }
}
