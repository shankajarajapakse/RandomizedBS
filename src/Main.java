
public class Main
{

    public static void main(String[] args)
    {
        DataService ds = new DataService(10000000);
        BinarySearch bs = new BinarySearch();
        RandomizedBS rbs = new RandomizedBS();

        Long startTime = System.nanoTime();
        int y;

        for (long n : ds.getSearchList())
        {
            y = bs.binSearch((int) n,ds.getArray(),0,ds.getArray().size());
        }

        System.out.println("Time taken to binary search            = " + (System.nanoTime()-startTime)+" nano seconds" );
        Long startRBS = System.nanoTime();

        for (long n : ds.getSearchList())
        {
            y = rbs.randomizedBinSearch((int) n,ds.getArray(),0,ds.getArray().size());
        }

        System.out.println("Time taken to randomized binary search = " + (System.nanoTime()-startRBS) +" nano seconds" );

        System.out.println("Array size     = "+ds.getArray().size());
        System.out.println("Searched count = "+ds.getSearchList().size());
    }
}
