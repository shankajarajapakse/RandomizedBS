import java.util.ArrayList;
import java.util.Arrays;

public class Main
{

    public static void main(String[] args)
    {
        DataService ds = new DataService(100000);
        System.out.println(ds.getArray().size());
        System.out.println(Arrays.toString(new ArrayList[]{ds.getSearchList()}));

    }
}
