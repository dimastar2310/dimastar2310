import java.util.ArrayList;

public class BSTGame {
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

    class BSTree {
        BSNode root;

        BSTree() {
            root = null;
        }

        //100% going to add here nodes and i have to make my array li with nodes
        public void add(BSNode bsNode) { //i want to add array list for
            root = add(bsNode, root); //eshal le po nodes
        }

        //random generated data is balanced but my data not random
        private BSNode add(BSNode bs, BSNode curr) { //root == curr at start
            if (curr == null) {
                //habaya she ani ken zarih et kol hanode
                curr = new BSNode(bs); //copy constructor
                System.out.println("iam at null");

//
                return curr;
            }
            //ze le ez hipus ze pashut osafa
            else if (bs.size < curr.size) {
                if (curr.left != null) {
                    curr = add(bs, curr.left);
                    System.out.println("iam at add left");
                } else {
                    System.out.println("iam at add right");
                    curr = add(bs, curr.right);
                }
            }

            return curr;
        }

    }

    private int partition(ArrayList<BSNode> arr, int begin, int end) {
        int pivot = arr.get(end).size;
        int i = (begin - 1);

        for (int j = begin; j < end; j++) {
            if (arr.get(j).size >= pivot) {
                i++;

                BSNode swapTemp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, swapTemp);
            }
        }

        BSNode swapTemp = arr.get(i + 1);
        arr.set(i + 1, arr.get(end));
        arr.set(end, swapTemp);


        return i + 1;
    }

    public void quickSort(ArrayList<BSNode> arr, int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);

            quickSort(arr, begin, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, end);
        }
    }

    public static void main(String[] args) {
        int arr[] = {5, 2, 10, 1};
        BSTGame Bst = new BSTGame(); //i will call it game after
        Bst.all_combination(arr);
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
    //need to move 2i+1 2i+2

    void all_combination(int[] arr) { //bo nire she mekablim et

        ArrayList<BSNode> al = new ArrayList<>(); //le hoshev she hu hayav lekabel mizad yamin mashu
        int tavnit[] = new int[arr.length];
        tavnit[arr.length - 1] = 1; //nathil mi mispar haba
        //tavnit[0] = 1; //neathel tavnit mispar ahat
        int n = arr.length; //size of tree

        int size = (int) Math.pow(2, n) - 1; //ani le roze tat kvuza ahat
        for (int i = 1; i < size; i++) { //razim be godel haez
            ArrayList<Integer> temp = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if (tavnit[0] == 1 && tavnit[arr.length - 1] == 1) { //problem
                    //plus1(tavnit); // le rozim et ze skip // eih ata yodea she shaar lo ehad
                    break;
                }
                if (tavnit[j] == 1) { // bo nishmor indexim ve az nikah rishon ve aharon
                    temp.add(j); //
                }
            }

            if (!temp.isEmpty()) { //logic needed here for the object
                BSNode B = new BSNode(temp.get(0), temp.get(temp.size() - 1)); //lokeah index rishon ve aharon
                if (temp.get(0) == temp.get(temp.size() - 1)) { //otomatit sahkan b
                    B.val = -arr[temp.get(0)]; // kol eivar ze index //naniah ve ani roze otam be
                    B.sight = '-';
                }

                al.add(B);
            }
            plus1(tavnit);
        }


        BSNode B = new BSNode(0, arr.length - 1); //eivar ze indexim
        al.add(B);


        quickSort(al, 0, al.size() - 1);
        //now my arraylist ih maxheap
        BSTree answer = new BSTree();
        //nod really need it


        BSNode p = answer.root;
        //postorder(al);
        //bo nileh preorder
        buildMaxHeap(al);
        CheakMyHeap(al); //leadpis

//
//
//        }

        //now lets try to feel the tree that represented with array list
        //tahles od funkiz adif

        System.out.println("is it max heap?" + isMaxHeap(al));
        //sort(al);


    }

    private void CheakMyHeap(ArrayList<BSNode> al) {

        for (int i = 0; i < al.size(); i++) { //laruz ve ofen shriruti limhok
            System.out.println(al.get(i).printBNode());
            //ok nahnis le ze ve az nivdok be postorder she avad

        }
    }

    //funkzia she temale li et haez
    public void buildMaxHeap(ArrayList<BSNode> al) {//O(n)
        for (int i = al.size() / 2 - 1; i >= 0; i--) { //po kol hakesem zarih likrot
            //mathilim mi aba
            //ylai lidhof size o mashu
            //will do setting here not maxheapify if 2i+1 and 2i+2
            //ve gam esh evdel be simanim bein tahton le elion
            //bodek al 2 tahtonim zarih 2 informaziot
            int tempval = 0; //oto neyasem
            //nishmor 2
            //nekudat anaha shnehem oto siman
            //bdika generit
            if (2 * i + 1 < al.size() && 2 * i + 1 < al.size()) { //ben smali
                //minus haya tor shel sahkan - tori kaet
                if (al.get(2 * i + 1).sight == '-') { //im siman plus o siman minus aheret

                }


            }
        }
    }
        public static boolean isMaxHeap (ArrayList < BSNode > arr) {
            boolean ans = true;
            for (int i = 0; ans && i < arr.size() / 2; i++) {
                //System.out.println("iam at for");
                int left = i * 2 + 1;
                int right = i * 2 + 2;
                if (left < arr.size() && arr.get(i).size < arr.get(left).size) ans = false;
                if (ans && right < arr.size() && arr.get(i).size < arr.get(right).size) ans = false;
            }
            return ans;
        }


    }

