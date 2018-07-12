import java.util.ArrayList;
import java.util.Random;

public class DataService
{
    private int count;
    private ArrayList<Long> array = new ArrayList<Long>();
    private ArrayList<Long> searchList = new ArrayList<Long>();

    public DataService(int count)
    {
        this.count = count;
        this.generateIntegers();
    }

    private void generateIntegers()
    {

        long val = 0;
        Random rand = new Random();
        int searchableCount = 700;
        int nonSearchableCount = 300;

        for (int i = 0; i < this.count ; i++)
        {
            int randomNum = rand.nextInt(5)+2 ;  //random number between 2 and 5
            val += randomNum;
            array.add(val);

            /**
             * Searching number generation process
             */
            if (nonSearchableCount > 0)
            {
                if (rand.nextBoolean())
                {
                    nonSearchableCount -= 1;
                    searchList.add(val-1);
                }
            }
            if (searchableCount > 0 )
            {
                if (rand.nextBoolean())
                {
                    searchableCount -= 1;
                    searchList.add(val);
                }
            }

        }


    }

    public ArrayList<Long> getSearchList()
    {
        return this.searchList;
    }

    public ArrayList<Long> getArray() {
        return this.array;
    }

}
