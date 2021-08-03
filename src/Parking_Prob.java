/* private int x = 5;
    private  int y = 7;
     private static int l=5; //stati le class nohehi
     static  int ro = 3;

   */
class Node{

    Node next;
    Node prev;
    char cur_char;

    Node(char c){
        cur_char = c;
        next = null;
        prev = null;

    }

}
//need to work on it
//class Circle_LL { //ba default public nitan lagesh mi kol class aher ba package
//    //po nitan laasot sofer stati
//    Node head;
//    Circle_LL(){
//        head = null;
//    }
//    public void  insert(char v) {
//        Node n = new Node(v);
//        if (head ==null){ //sadot le statim yaholim likare rak mi funkziot le statiot
//            head = n;
//        }
//        else //hayavim else aheret yamshih gam kah
//        {
//
//
//        }
//
//    }
//}
//class rashi
public class Parking_Prob { //elizabeth amra she efshar paam ehad kaze
    Double_CLL cars;
    //ve nivhar simanim
    //naniah ani roze leakbil
    final int nletters = 23, size = 13; //<godel reshima ,mispar otiot
    final int v = 'v', w = 'w'; //ein be java const
    Parking_Prob(){ //nivne ota randomalit
        cars = new Double_CLL();

            for(int i= 0;i<size;i++){ //efshar gam im reshima
                char c = (char)('a'+(int)(Math.random()*nletters));
                cars.insertDCLL(c);

            }
            cars.print();
        }
        public int calcars(){ //po nivne et haraayon //zarih leahzir 13

        cars.head.c ='v';//simun rishon
            //zarih livnot et harobot ve lekadem oto zad kidei le litaka
            Double_CLL.Node3 t = cars.head.next; //itkadamnut zaad im obeit Node3
        //    System.out.println("t.c = "+t.c);
         //navi et haklas le po o mashu
         boolean flag = true;
         int caunt =1;
         while(flag){
             if(t.c == 'v'){
                 t.c = 'w'; //nahlif le w
                 int i =caunt; //nishmor mone ,kol paam caunt hadash mi else haaharon
                 while (i>0){ //nahzor mispar zaadim she itkadamnu
                     t= t.prev;
                     i--;

                 }

                 //itkadamnu hazara ve gilinu ki w az efshar lazet
                 //harayon ze mispar hazzadim hazara
                 if(t.c=='w'){ //siyamnu
                     flag = false;
                 }
                 //aheret ze v
                 else //aheret nitkadem zaad ve nathil shuv
                 {
                     caunt = 1;
                     t= cars.head.next; //nitkadem shuv zad she le nitaka
                 }
             }
             else //aheret nitkadem
             {
                // System.out.println("iam at major else");
                 t = t.next; //finished here we going back to while
                 //one step and we go back to while
                 caunt++;
             }

         }


        return caunt;
        }




    public static void main(String[] args) {
   Parking_Prob pb = new Parking_Prob();
   int caunt = pb.calcars();
    System.out.println("the lenght is ="+caunt);
    }


}
