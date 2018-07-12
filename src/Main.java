import java.util.ArrayList;
import java.util.Arrays;

public class Main
{

    public static void main(String[] args)
    {
        DataService ds = new DataService(100000);
        BinarySearch bs = new BinarySearch();
        System.out.println(bs.BinSearch(1032,ds.getArray(),0,ds.getArray().size()));
    }
}
