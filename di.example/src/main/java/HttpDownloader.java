/**
 * Created by PoGo on 25.04.2017.
 */
public class HttpDownloader implements Downloader {

    @Override
    public String download(String path) {
        return "I'm string from HTTP";
    }
}
