import java.util.ArrayList;
import java.util.List;

/**
 * Created by УВД on 21.04.2017.
 */
public class UserListSingleTone {
   private static List<User> list=buildList();
    private static List<User> buildList(){
        List<User> userList=new ArrayList<>();
        return userList;
    }
    public static List<User> getUserList(){
        return list;
    }
}
