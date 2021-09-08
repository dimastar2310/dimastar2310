import java.util.ArrayList;
public class TestMax {
    class BSNode { //need to make comparator
        int val;//im magiim le keta [1,1] laasot -v al ve sight -
        // ArrayList<Integer> al;
        int left_ind;
        int right_ind;
        char sight;//yaholiot ze thuna shel ez ve le shel yahid
        BSNode right;
        BSNode left;
        int size;

        //v can be added after
        BSNode(int left_ind, int right_ind) { //plus or minus
            //this.v = v;
            this.left_ind = left_ind;
            this.right_ind = right_ind;
            this.size = right_ind - left_ind + 1;
            //this.sight = sight;
            //right = null;
            //left = null;
        }

        BSNode(BSNode other) {
            this.val = other.val;
            this.left_ind = other.left_ind;
            this.right_ind = other.right_ind;
            //the sight its kinda problematic
            this.sight = other.sight;
        }


        public boolean printBNode() {
            System.out.println("val is = " + val + " left_ind =" + left_ind + " right_ind = " + right_ind + " sight is = " + sight +
                    " size is = " + size);
            // System.out.println();
            return false;
        }

    }


    public static void main(String[] args) {
        int arr[] = {5, 20, 10, 1};
        allneedsubset(arr);
    }

    private static void allneedsubset(int[] arr) {

        int n = arr.length;
        int size = (int) Math.pow(2, n) - 3; //zise -3 basof
        //tamid ihiu li start ve end hadashim
        //mi katan le gadol naase
        ArrayList<ArrayList<Integer>> al = new ArrayList<>();

        ArrayList<Integer> a = new ArrayList<>(); //bli index smali

        ArrayList<Integer> b = new ArrayList<>(); //eshli 2 index beayatim nitapel b kol ehad be nifrad ve alehem naavo
        ArrayList<Integer> c = new ArrayList<>(); //gam godel shelo yadua
        //tipalti bahem kvar
        //finish

        for (int i = 0; i < n - 1; i++) {
            a.add(arr[i]); //ahrakah nahlif be index
        }
       // System.out.println("print a");
       // System.out.println(a.toString());
        for (int i = 1; i < n; i++) {
            b.add(arr[i]);
        }
                //System.out.println("print b");
       // System.out.println(b.toString());

        for (int i = 0; i < n; i++) {

            c.add(arr[i]);
        }
      //  System.out.println(c.toString());
        al.add((ArrayList<Integer>) a.clone()); //without right
        al.add((ArrayList<Integer>) b.clone());//without left
        al.add((ArrayList<Integer>) c.clone());//full
        //copy of arrays
        //mishtane she odea matai mesaimim
        int finish = 0; // end then finish + 1 she nida
        //efo anshnu dohfim be array

            //System.out.println("iam at for");
            int j = 0;
            while (!a.isEmpty()) { //remove index rishon
                //System.out.println(a.toString());
                a.remove(j); //maby i dont need there copy just chop from left
                // ArrayList<Integer> temp = (ArrayList<Integer>) a.clone();
               // j++;
                if(a.size()==0){
                    break;

                }
                al.add((ArrayList<Integer>) a.clone());

            }
//        for (int i = 0; i < al.size(); i++) {
//            System.out.println(al.get(i));
//        }
        System.out.println("finished a");
            //j = 0;
            while (!b.isEmpty()) {
              //   System.out.println(b.toString());
                //ArrayList<Integer> temp = (ArrayList<Integer>) b.clone();
                b.remove(j);
                if(b.size()==0){
                    break;
                }
               // j++;
                al.add((ArrayList<Integer>) b.clone());
            }
         System.out.println("finish b");


        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }
        //laasot heetekim shelo
        //heetekim


        //int end = arr.length;
        //int start = 0;
        //gimme_all_subs(arr,al,a,start,end);

    }
}

//    private static void gimme_all_subs(int[] arr,ArrayList<ArrayList<Integer>> al,ArrayList<Integer> a, int start, int end) {
//        for(int i=start;i<end;i++){
//
//        }
//
//
//    }

