import My_Library.MyLybrary; //random big array library all methods here as static

import java.util.Stack;

class Stacknode{
        Stack<Integer> stackOfNode;
        int max1;
        //maarah shel nodim
        Stacknode(int val){ //beathila kulam maksim aherei ze nahlif kulam maximum
            max1 = val;
            stackOfNode= new Stack<Integer>();
        }
    }

public class MaxMax_Rec {
    Stacknode[] star; //stack node arr
    int size;

    MaxMax_Rec(int arr[]) { //kulam maximum beathala
        size = arr.length;
        star = new Stacknode[size];
        for (int i = 0; i < size; i++) {
            star[i] = new Stacknode(arr[i]);
        }
    }

    public void Max1_Max2() {
        int low = 0, hight = size;
        int Max1_ind = MaxMax_Reco(star, low, hight-1); //ein beaya naase modifikazia le kol eiv
        //betoh maarah bo zmanit
        //aherei she asinu modifikazia naase pop() ve nimza max2 ..const time
        int Max2 = popMax2(Max1_ind); //nishlah index shemazanu mi max1_ind
        //nevaze pop le mahsanit ad she nikabel eivar beemet
        System.out.println("Max1 is =" + star[Max1_ind].max1); //max1 is
        System.out.println("Max2 is =" + Max2);
    }

    private int popMax2(int max1_ind) {
        Stacknode p = star[max1_ind];
        int max2 = 0;
        while (!p.stackOfNode.empty()){
            if(p.stackOfNode.peek()>max2){
                max2 = p.stackOfNode.peek();

            }
            p.stackOfNode.pop(); //do it anyways
        }
        return max2;
    }

    private int MaxMax_Reco(Stacknode[] star, int low, int hight) {

        int mid;
        if (low < hight) {
            mid = (low + hight) / 2;
            //recursion will happen till each elemnt be alone
            //arr is same but indexes changing
            int i = MaxMax_Reco(star, low, mid);
            int j = MaxMax_Reco(star, mid + 1, hight); //kashe anhnu {6} smol ve {3} yamin yashar nilem le yamin
            if (star[i].max1 > star[j].max1) {
                star[i].stackOfNode.push(star[j].max1); //le ihie meanein otanu index j kvar
                return i; //mahzirim index shel eivar kadol beyoter

            } else //star[i].max1<star[j].max1
            {
                star[j].stackOfNode.push(star[i].max1);
                return j; //mahzirim index eivar gadol beyoter
            }
        }

        return low; //index hahi katan lefi tnai azira miztamzemim
    }




    //yohas method
public static void main(String[] args) {
    int arr[] = {3,8,9,5,3,10};
    //int arr1[] = randArr(100);
    //MyLybrary ml = new MyLybrary(); //eih osim et ze lele new
    //int arr2[] = ml.randomIntegerArray2(20); //
    int arr3[] = MyLybrary.randomIntegerArray(20); //accesing directly
    int arr4[] = MyLybrary.randomIntegerArray2(20000);
    Max1_Max2_Yoha(arr);
    Max1_Max2_Rec(arr3);
    Max1_Max2_Rec(arr4);
    //le kol eivar nazmid mahsanit
}

    private static void Max1_Max2_Rec(int[] arr) {
    MaxMax_Rec mmr = new MaxMax_Rec(arr);
    mmr.Max1_Max2();

    }

    private static void Max1_Max2_Yoha(int[] arr) {
    int max1 = arr[0];
    int max2 = 0;
    int comp =0;
        for (int i = 1; i <arr.length ; i++) {
            comp++;
            if(arr[i]>max1){
                max2 = max1;
                max1 = arr[i];
            }
        }
        System.out.println("number of comparisons that have been made are "+comp);
        System.out.println("max1 is ="+max1+"max2 is = "+max2);
    }

}
