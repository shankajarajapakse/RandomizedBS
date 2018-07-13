import java.util.ArrayList;
import java.util.Random;

public class RandomizedBS
{
    public static int randomizedBinSearch(int x, ArrayList<Long> A, int low, int high )
    {
        int middle;
        int sol;

        if ( low > high )
        {
            return( -1 );        // Not found
        }
        else
        {
            Random rand = new Random();
            middle = rand.nextInt( high - low + 1 )+low ;
            if ( x == A.get(middle) )
            {
                sol = middle;         // Found x, return location in array
            }
            else if ( x < A.get(middle)  )
            {
                sol = randomizedBinSearch( x, A, low, middle-1 );  // Solve smaller problem
            }
            else  //  x > A[middle]
            {
                sol = randomizedBinSearch( x, A, middle+1, high );  // Solve smaller problem
            }

            return ( sol );
        }
    }
}
