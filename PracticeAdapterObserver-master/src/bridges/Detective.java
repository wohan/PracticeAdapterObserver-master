package bridges;

import java.util.List;

/**
 * Created by admin on 04.05.2017.
 */
public interface Detective {

    String getHistoryCriminal(int userId, String date);
    List<Integer> getLikesCriminal(int userId, boolean showNegative,int messageId);
}

