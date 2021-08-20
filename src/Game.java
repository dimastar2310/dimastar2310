import java.lang.reflect.Array;
import java.util.ArrayList;

public class Game {
static class Play_obj{ //X=X-Y || Y = Y-X || F = -F
    //dont think that this obj has to be static
    int len,diff_a,diff_b,left,right,range ; //diff are side to side to val (k,l) we dont need k,l excsially range is enought
    //range is len
    //hefrshim li nitanim benataim value aval ken
    //value that assosiated with group?
    //dinamic array maby in each obj
    //or maby better to hold indexes call from does indexes in array
    //each object might hold first and lest index
    //each object could hold groups in array list but stil indexes is enouth 2 indexes
    public Play_obj(int left,int right){
        this.left = left;
        this.right=right;
        //this.diff_b = diff_b;
    }

}
    private  static void plus1(int[] bin){ //po nikabel maarahim had memadim et ze zarih leadken
        int size = bin.length-1;
        int i =0;
        while(i<=size && bin[size]==1){
            bin[i++] = 0;
        }
        if(i>=0){
            bin[size] = 1;

        }
        //ok idkanti


    }
    //i think this function needs to be static
    public static ArrayList<Play_obj> int_comb(int[] arr){ //zarih kaze shel obektim Play_obj

        int n = arr.length;
        //its array java 10+ has var
        var p = new int[n]; //kavua n sheihi nishlah le +1 i mekabelet arr
        int size =(int) Math.pow(2,n) -1;

        ArrayList<Game.Play_obj> res = new ArrayList<>(size); //ani yodea ma tozaa basof

        for (int i =0;i<size;i++){ //Object kinda size?
            //neathel oto mehadash hashuv
            int caunt = 0; //kol pam oreh mishtane
            //ulai leahnis hazara le array list beemet
             int temp[] = new int[arr.length]; //oto nemala ve nahnis le arraylist du meimadi
            for(int j =0;j<n;j++){ //le amur liot mishane meifo lalehet batahles
                if(p[j]==1){ //indexacia ze hefreshim ani zarih efreshim bein indexim zarih orahim shel
                    //temp.add(arr[j]); //ze nahon ze beseder aval tnai shone mosif eivar be makom ze
                  caunt++;
                }
            }
            //kan mitbazat bnia
            //zarih leahnis caunt le object ve leadken efresh bein sahkan x le y
            //zarih laafoh et +1 seder kanire le zarih laasot lo modifikazia
            //zarih lisahek im efreshim yaholiot rekurisivi
              //zarih litfos indexim
            //
       //   Play_obj p_o = new Play_obj(caunt,diff_a,diff_b); //zarih lesahek im ze caunt ze oreh shel kol tat sidra
        //    res.add(p_o);
          //  plus1(p);
        }

        return  res; //object array list betoho
    }
//we have to get all the possibilities for arr
//size is our modification for max head 1>2>4>8>16 size of indexes i-j+1
class Max_Heap{ //we start from index 1
    int size;

    //le tov arr
    Play_obj g; //obj game compare fucnction is size of each node
    //yaholiot le zarih leazhir ma dohfim letoho
    //heart of the program because here we get all the possabilities
    ArrayList<Play_obj> al = new ArrayList<Play_obj>(); //memalim oto

         Max_Heap(int[] arr){
        buildMax_Heap(arr); //from arr

    }
    public void Max_Heapify(ArrayList<Play_obj> al,int i){//rozim livnot et ze le matarot shelanu




    }
    //leahzir aharkah le arr beseder
 //ani zarih she yahil obeiktim
    private void buildMax_Heap(int[] arr) { //naruz ad 2^(n-2)
        int n = arr.length-1; //2^n -1 we said before we need another index
        //thats why +1
        //this.size ze baunderi le debugg
        this.size = (int)Math.pow(2,n); //provided double was error before
        ArrayList<Game.Play_obj> p = new ArrayList<>(size); //zarih kaze shel obeiktim
        p = Game.int_comb(arr); //ani zarih laasot le ze modifikazia zarih mikumim bihlal //zarih rak indexim hefresh
        //zarih laasot le ze modifikazia //indexim ve arahim ani zarih
        int size1 = this.size/2 -1;
        //po nahnis et haobektim le maxheap it will work find maximum in branch
        for(int i = size1;i>=0;i-- ) { //nileh le index aharon kodkod haav ve mimeno naale mala
            Max_Heapify(p,i); //ani roze laadat ma harezef nahon shel hasidra
        }

       // this.al = new ArrayList<Play_obj>(size); //we want to represent heap with arr right
          //maby merge technic for that tahles funkzia +1 aval ze sibuhiot 2^n //aval ein brira kanire
        //funkziat plus azma kszat muszara
        //zarih lishtamesh be merge baduk


    }

}



    public Game(int[] arr){
    Max_Heap mh = new Max_Heap(arr);
    }

    public int maxDifference(){ //function that return max_diff for player a
    return -1;
    } //player a to b
    public String getGame(){ //function that builds the game
    return "";
    } //returning the game itself the path
    public void printGame(){ //function that use maxDifference and returning the game itself
    //the best game ? i mean only one anaf?


    }




    public static void main(String[] args) {
        int arr[] = {4,1,5,9};
        Game g = new Game(arr);



    }
}
