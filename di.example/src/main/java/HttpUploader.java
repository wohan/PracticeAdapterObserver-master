/**
 * Created by PoGo on 25.04.2017.
 */
public class HttpUploader implements Uploader {
    @Override
    public Boolean upload(String content) {
        System.out.println(content + " downloaded by HTTP");
        return true;
    }
}
