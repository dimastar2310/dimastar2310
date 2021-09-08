import java.lang.reflect.Array;
import java.util.ArrayList;

public class Game {
static class Play_obj{ //X=X-Y || Y = Y-X || F = -F
    //dont think that this obj has to be static
    int len,diff_a,diff_b,left,right,range ; //diff are side to side to val (k,l) we dont need k,l excsially range is enought

    public Play_obj(int left,int right){
        this.left = left;
        this.right=right;
        //this.diff_b = diff_b;
    }

}


    public Game(int[] arr){

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
