//import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.PriorityQueue;

public class testMatala {

    //need to make priority qeue and comparator


    class obj_player { //need to make comparator
        int v;//im magiim le keta [1,1] laasot -v al ve sight -
        ArrayList<Integer> al;
        char sight;//yaholiot ze thuna shel ez ve le shel yahid

        //v can be added after
        obj_player(ArrayList<Integer> al, char sight) { //plus or minus
            //this.v = v;
            this.al = al;
            this.sight = sight;
        }


        public void print() {
            System.out.println(al);
            System.out.print(sight);
        }

    }
/** The root of the tree is A[1], i is the of a node
 the Max-Heap Property : for every node i other than the root:
 A[parent[i]]>=A[i], that is the value of the node
 is at most the value of its parent.
 Thus, the largest element in a max-heap is stored at the root.
 **/
    /**
     * Constructor
     */
    public class HeapMaxImplementation {
        int _negativeInfinity = Integer.MIN_VALUE;
        ArrayList<obj_player> al = new ArrayList<>();

        //private int _size;
        public HeapMaxImplementation(ArrayList<obj_player> obj) {
            //  _size = arr.length;
            al = obj; //bo nenase reduda
            //buildMaxHeap();
        }

        /**
         * parent returns the parent of vertex  i
         *///we starting from ind 0
        private int parent(int i) {
            return (i - 1) / 2;
        } //O(1) //aba razim al indexim

        /**
         * leftChild returns the left child of vertex  i
         */
        private int leftChild(int i) {
            return 2 * i + 1;
        }//O(1)

        /**
         * rightChild returns the right child of vertex  i
         */
        private int rightChild(int i) {
            return 2 * i + 2;
        }//O(1)

        /**
         * returns the heap maximum
         */
        public obj_player heapMaximum() {
            return al.get(0);
        }//O(1)

        public boolean isMaxHeap(int[] arr) {
            boolean ans = true;
            for (int i = 0; ans && i < arr.length / 2; i++) {
                int left = i * 2 + 1;
                int right = i * 2 + 2;
                if (left < arr.length && arr[i] < arr[left]) ans = false;
                if (ans && right < arr.length && arr[i] < arr[right]) ans = false;
            }
            return ans;
        }

        //i need comparotor ,change the 2d array in function to adding here
        //zarih lahshov al simanim eih ani misamen
        PriorityQueue<obj_player> pq = new PriorityQueue<obj_player>();


        public  void main(String[] args) {
            int arr[] = {4, 1, 5};
            testMatala tm = new testMatala(); //i will call it game after
            //tm.all_combination(arr);
            //    tm.print();
        }

        private void plus1(int[] bin) { //po nikabel maarahim had memadim et ze zarih leadken
            int i = bin.length - 1;
            //  int i =0;
            while (bin[i] == 1) {
                bin[i--] = 0;
            }
            //aheret naatik
            if (i >= 0) { //le heganu le sof naafoh 0 le 1 1 1 1 >> 000
                bin[i] = 1;

            }
            //System.out.println(Arrays.toString(bin));

        }

        //i want to check that its working
        //i can from this moment to add it to prioriryQue
        //only need comperator
        //kvar mi po ahnis le priority qeue
        private void all_combination(int[] arr) { //bo nire she mekablim et
            //kol tatei hakvuzot be zurat void
            //i want to save the combinations
            //nahnis le array list du meimadi ve nadpis aharkah
            ArrayList<ArrayList<Integer>> al = new ArrayList<>(); //le hoshev she hu hayav lekabel mizad yamin mashu
            int tavnit[] = new int[arr.length];
            tavnit[arr.length - 1] = 1; //nathil mi mispar haba
            //tavnit[0] = 1; //neathel tavnit mispar ahat
            int n = arr.length; //size of tree
            //array list temporali
            int size = (int) Math.pow(2, n) - 1; //ani le roze tat kvuza ahat
            for (int i = 1; i < size; i++) { //razim be godel haez
                ArrayList<Integer> temp = new ArrayList<>();
                //boolean out = true;
                for (int j = 0; j < n; j++) {
                    //System.out.println(temp);

                    if (tavnit[0] == 1 && tavnit[arr.length - 1] == 1) { //problem
                        //plus1(tavnit); // le rozim et ze skip // eih ata yodea she shaar lo ehad
                        break;
                    }
                    if (tavnit[j] == 1) {
                        temp.add(arr[j]);
                    }
                }
                //out = true;
                //i have 2 problematic functions
                //if(!temp.isEmpty() && temp.get(0) !=arr[0] && temp.get(temp.size()-1)!=arr[arr.length-1]){
                if (!temp.isEmpty()) { //logic needed here for the object

                    obj_player o_p = new obj_player(temp, '-');
                    pq.add(o_p); //i need to make it object //print method for the obj maby
                    al.add(temp);
                }
                //}
                plus1(tavnit);
            }

            // al.remove(0);
            ArrayList<Integer> temp = new ArrayList<>();
            for (int i = 0; i < arr.length; i++) {
                temp.add(arr[i]);
            }

            //     //System.out.println(temp);
            // }
            al.add(temp);
            //al.remove(0);

            for (int i = 0; i < al.size(); i++) { //laruz ve ofen shriruti limhok
                System.out.println(al.get(i));

            }


        }

        public void print() { //maby need opeator
            Iterator<obj_player> iter = pq.iterator();
            for (obj_player e : pq) {
                e.print();
            }
        }

    }
}
