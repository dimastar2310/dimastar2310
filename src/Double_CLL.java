public class Double_CLL {

    class Node3{
        char c;
        Node3 next;
        Node3 prev;
        Node3(char c){
            this.c = c;
        }
    }
    Node3 head;
    Node3 tail;

    final int nLetters = 25,size =13 ;//<alphabetic letter ,size of CLL>
    Double_CLL(){
        head = null;
        tail = null;
    }
    //inserting in front
    public void insertDCLL(char c){
        Node3 p = new Node3(c);
        if(head == null){
            p.next =p.prev = p; //yazbia al azmo
            head = tail=p;
            //System.out.println("iam at if");
            //System.out.println("head c ="+head.c);
        }
        else
        {

//            p.prev = head;
//            p.next = head;
//            head.prev = p;
//            head.next= p;
//            head = p;
            tail.next = p;
            head.prev = p;
            p.prev = tail; //hatail tamid mishtane
            p.next = head;
            tail = p;
         //   System.out.println("iam at else instert");
            //System.out.println("curr h is = "+head.c);
            //System.out.println("curr tail is ="+tail.c);

        }

    }
    public void random_insert(){
        for(int i= 0;i<size;i++){ //efshar gam im reshima
            char c = (char)('a'+(int)(Math.random()*nLetters));
            insertDCLL(c);

        }
    }
    public void print(){ //bli static eshli opzia gam lageshet le mishtanim le statim
        Node3 temp = head;
        int i=0;
        //String k = "";
        System.out.println("head = "+head.c);
        System.out.println("tail = "+tail.c);
        while(i<size){
            //k = k.toString(i);
            System.out.println(Integer.toString(i));
            System.out.println("curr ="+temp.c);
            System.out.println("next ="+temp.next.c);
            System.out.println("prev = "+temp.prev.c);
            temp = temp.next;
            i++;
        }

    }


    public static void main(String[] args) {
     Double_CLL dcll = new Double_CLL();
     dcll.random_insert();
    dcll.print();
    }
}
