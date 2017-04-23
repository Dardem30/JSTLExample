import java.util.ArrayList;
import java.util.List;

/**
 * Created by УВД on 21.04.2017.
 */
public class CatListSingleTone {
    private static List<Cat> list=buildList();
    private static List<Cat> buildList(){
        List<Cat> list=new ArrayList<>();
        return list;
    }
    public static List<Cat> getList(){
        return list;
    }
}
