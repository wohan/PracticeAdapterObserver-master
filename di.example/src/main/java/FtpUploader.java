/**
 * Created by PoGo on 25.04.2017.
 */
public class FtpUploader implements Uploader {
    @Override
    public Boolean upload(String content) {
        System.out.println(content + " downloaded by FTP");
        return true;
    }
}
