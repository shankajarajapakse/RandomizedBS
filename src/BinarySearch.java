import java.util.ArrayList;

public class BinarySearch
{
    public static int binSearch(int x, ArrayList<Long> A, int low, int high )
    {
        int middle;
        int mySol;

        if ( low > high )
        {
            return( -1 );        // Not found
        }
        else
        {
            middle = (low + high)/2;
            if ( x == A.get(middle) )
            {
                mySol = middle;         // Found x, return location in array
            }
            else if ( x < A.get(middle)  )
            {
                mySol = binSearch( x, A, low, middle-1 );  // Solve smaller problem
            }
            else  //  x > A[middle]
            {
                mySol = binSearch( x, A, middle+1, high );  // Solve smaller problem
            }

            return ( mySol );
        }
    }


}
