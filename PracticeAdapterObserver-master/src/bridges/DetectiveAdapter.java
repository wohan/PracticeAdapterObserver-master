package bridges;

import java.util.List;

/**
 * Created by admin on 04.05.2017.
 */
public class DetectiveAdapter implements Detective {

    private BasicSocialWeb extendedSocialWeb;

    public DetectiveAdapter(BasicSocialWeb extendedSocialWeb) {
        this.extendedSocialWeb = extendedSocialWeb;
    }

    @Override
    public String getHistoryCriminal(int userId, String date) {
        if (extendedSocialWeb instanceof VKSocialWeb)
        {
            return new VKSocialWeb().getHistory();
        }
        if (extendedSocialWeb instanceof FacebookSocialWeb)
        {
            return new FacebookSocialWeb()
                    .getHistory(date);
        }
        return null;
    }

    @Override
    public List<Integer> getLikesCriminal(int userId,
                                          boolean showNegative,int messageId) {

        if (extendedSocialWeb instanceof VKSocialWeb)
        {
            return new VKSocialWeb()
                    .getLikes(userId,messageId);
        }
        if (extendedSocialWeb instanceof FacebookSocialWeb)
        {
            return new FacebookSocialWeb()
                    .getLikes(messageId,
                            showNegative,userId);
        }
        return null;
    }

}
