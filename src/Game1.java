import java.util.ArrayList;
import java.util.Arrays;

public class Game1 {


    //lets see first if we can generate all the subgroups array list could give
    //us the size too

    public static void main(String[] args) {
        int arr[] = {4,1,5};
        System.out.println(Arrays.toString(arr));

        all_combination(arr);
    }
    //
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








