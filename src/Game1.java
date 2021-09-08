import java.util.ArrayList;
import java.util.Arrays;

public class Game1 {

    // Returns the optimal value a maximizer can obtain.
// depth is current depth in game tree.
// nodeIndex is index of current node in scores[].
// isMax is true if current move is of maximizer, else false
// scores[] stores leaves of Game tree.
// h is maximum height of Game tree
    static int minimax(int depth, int nodeIndex, boolean  isMax,
                       int scores[], int h)
    {
        // Terminating condition. i.e leaf node is reached
        if (depth == h)
            return scores[nodeIndex];

        // If current move is maximizer, find the maximum attainable
        // value
        if (isMax)
            return Math.max(minimax(depth+1, nodeIndex*2, false, scores, h),
                    minimax(depth+1, nodeIndex*2 + 1, false, scores, h));

            // Else (If current move is Minimizer), find the minimum
            // attainable value
        else
            return Math.min(minimax(depth+1, nodeIndex*2, true, scores, h),
                    minimax(depth+1, nodeIndex*2 + 1, true, scores, h));
    }

    // A utility function to find Log n in base 2
    static int log2(int n)
    {
        return (n==1)? 0 : 1 + log2(n/2);
    }

// Driver code

    public static void main (String[] args) {
        // The number of elements in scores must be
        // a power of 2.
        int scores[] = {5,7,1,5,3,0,4,6};
        int n = scores.length;
        int h = log2(n);
        int res = minimax(0, 0, true, scores, h);
        System.out.println( "The optimal value is : "  +res);

    }

    private  static void plus1(int[] bin){ //po nikabel maarahim had memadim et ze zarih leadken
        int i = bin.length-1;
        //  int i =0;
        while(bin[i]==1){
            bin[i--] = 0;
        }
        //aheret naatik
        if(i>=0){ //le heganu le sof naafoh 0 le 1 1 1 1 >> 000
            bin[i] = 1;

        }
        //System.out.println(Arrays.toString(bin));

    }
    //i want to check that its working
    private static void all_combination(int[] arr) { //bo nire she mekablim et
        //kol tatei hakvuzot be zurat void
        //i want to save the combinations
        //nahnis le array list du meimadi ve nadpis aharkah
        ArrayList<ArrayList<Integer>> al = new ArrayList<>(); //le hoshev she hu hayav lekabel mizad yamin mashu
        int tavnit[] = new int[arr.length];
        //tavnit[0] = 1; //neathel tavnit mispar ahat
        int n = arr.length; //size of tree
        //array list temporali
        int size = (int) Math.pow(2, n) - 1; //ani le roze tat kvuza ahat
        for (int i = 0; i < size; i++) { //razim be godel haez
            ArrayList<Integer> temp = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if (tavnit[j] == 1) {
                    temp.add(arr[j]);
                }
            }
            plus1(tavnit);
            if(!temp.isEmpty() && temp.indexOf(0) !=arr[0] && temp.indexOf(temp.size())!=arr[arr.length-1]){
                al.add(temp);
            }
        }


        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            temp.add(arr[i]);
        }

        //     //System.out.println(temp);
        // }
        al.add(temp);
        //al.remove(0);

        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));

        }

    }
}
//ahshav ylai nitan leathil livnot max heap
    //lets print and see if it working








