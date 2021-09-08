import java.util.ArrayList;



public class test_minimum_diff {
   // static ArrayList<Integer> al = new ArrayList<Integer>();
    // Function to find the minimum sum
    public static int findMinRec(int arr[], int i,
                                 int sumCalculated,
                                 int sumTotal) {
        // If we have reached last element.
        // Sum of one subset is sumCalculated,
        // sum of other subset is sumTotal-
        // sumCalculated.  Return absolute
        // difference of two sums.
        if (i == 0) {
//            al.add(Math.abs((sumTotal - sumCalculated)
//                    - sumCalculated));
            return Math.abs((sumTotal - sumCalculated)
                    - sumCalculated);
        }

        // For every item arr[i], we have two choices
        // (1) We do not include it first set
        // (2) We include it in first set
        // We return minimum of two choices
        return Math.max(
                findMinRec(arr, i - 1,
                        sumCalculated + arr[i - 1],
                        sumTotal),
                findMinRec(arr, i - 1, sumCalculated,
                        sumTotal));
    }

    // Returns minimum possible difference between
    // sums of two subsets
    public static int findMin(int arr[], int n) {
        // Compute total sum of elements
        int sumTotal = 0;
        for (int i = 0; i < n; i++)
            sumTotal += arr[i];

        // Compute result using recursive function
        return findMinRec(arr, n, 0, sumTotal);
    }

    /* Driver program to test above function */
    public static void main(String[] args) {
        int arr[] = {5,20,10,1};
       // int arr2 [] = {5,20,10};
      //  int arr3[] = {20,10,1};
        int n = arr.length;
       // int firstdif = arr[0]-findMin(arr3,n-1);
        //int secondif = arr[arr.length-1] - findMin(arr2,n-1);
       // System.out.println("the game is = "+Math.min(firstdif,secondif));
        System.out.println("The minimum difference"
                + " between two sets is "
                + findMin(arr, n));
//        for(int i=0;i<al.size();i++){
//      System.out.println(al.get(i));
//        }
    }



}


