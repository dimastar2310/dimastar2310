class Node2{
    Node2 next;
    char c;
    Node2(char k){
        next = null;
        c = k;
    }

}


public class Single_CLL {
Node2 head;
Node2 tail;
final int nLetters = 25,size =13 ;//<alphabetic letter ,size of CLL>

Single_CLL(){
    head = null;
    tail = null;
}
public void insertCLL(char c){
    Node2 p = new Node2(c);
    if(head ==null ){
        head = p;
        tail = head;
        tail.next = head;

        //System.out.println("iam at insert if");
    }
    else
    {
     //    System.out.println("iam at insert else ");
        p.next = head;
        tail.next = p;
        tail = p;

    }
}
public void random_insert(){
    for(int i= 0;i<size;i++){ //efshar gam im reshima
        char c = (char)('a'+(int)(Math.random()*nLetters));
        insertCLL(c);

    }
}
public void print(){ //bli static eshli opzia gam lageshet le mishtanim le statim
    Node2 temp = head;
    while(temp!=tail){
System.out.println(temp.c);
        temp = temp.next;
    }

}





    public static void main(String[] args) {
    Single_CLL scll = new Single_CLL();
    scll.random_insert();
    scll.print();

    }
}
