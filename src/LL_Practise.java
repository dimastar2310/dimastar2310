class  Node1{//could make it private somehome
    int val ;
    Node1 next;
    Node1(int k){
        val = k;
    }

}
public class LL_Practise {
    Node1 head;
    //int size;
    final int p = 3;
    static int c = 0; //nitan leagdir mipo
     int l = 0;
    LL_Practise(){
        head = null;
        //size=0;
    }

    //return 3d element from end w/o  loops
    public void insert_front(int k) { //im le stati le nitan lagesh mi main le zarih gam LL.practise(5) le itafher kodem
        //niztareh leagdir
        Node1 p = new Node1(k);
        if (head == null) {
            head = p;
        } else {
            p.next = head;
            head = p;
        }
        //size++;

    }
    //return 3rd element from last rec
    public void  therd_elm() {
        Node1 h = head;
        Node1 t = head;
        int c = 0;
        while (h.next != null) {
            while (t != h) { //le ikanes le tnai harishon ve ikfoz
                t = t.next;
            }
            if (h.next.next == null) {
                break;
            } else {
                h = h.next.next;

            }

            System.out.println("the firtd elem from end " + t.val); //kaasher eshlnau kamut gdola shel eivarim
            //naadif leadpis
        }
    }
    public int n_elemnth(int n){
        Node1 p = head; //rishon
        Node1 s =head;//sheni
        int size = 0;
        //negale size nileh size-n+1
        for(;p!=null;p=p.next){  //2n naniah ze le ma shebikshu
           // System.out.println("head value is ="+head.val);
        size++;
            //str+=p.val+"->";
        }
       // System.out.println("slow wal is ="+s.val);
        int i=0;
        for(;s!=null;s=s.next){
         if(size-n==i){
             return s.val;
         }
         i++;
            //str+=p.val+"->";
        }

        return -1; //le kayam

    }


    public void print()

    { //kaha nitan lageshet le sadot le statim
      Node1 p = head;
      String str = "";
      for(;p!=null;p=p.next){
          str+=p.val+"->";
      }
      System.out.println(str);
    }


 //main zarih liot betoh
    public static void main(String[] args) {
    LL_Practise LL = new LL_Practise();
    //mosifim miharosh algo haya tov ...
        //eivar 3 mihasof ze 8
    LL.insert_front(5);
    LL.insert_front(2);
    LL.insert_front(8);
    LL.insert_front(9);
    LL.insert_front(10);
    LL.insert_front(12);
    //naase rega reshima mekusheret maagalit
    //LL.print();
       LL.therd_elm();
       System.out.println("the 3rd element=" +LL.n_elemnth(3));
      // System.out.println("answer is ="+p);
  Node1 p = new Node1(5);
  p.next = new Node1(10);
  p.next.next= new Node1(20);
  p.next.next.next = new Node1(30);
  p.next.next.next.next = new Node1(40);
  p.next.next.next.next.next = new Node1(1);


    }

}
