import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//player is going to check w/e to move on evin or odd numbers
//if sum of odd is bigger then he will move there else other
//method to print array w/o using loop int arr[] = {1,2,3,4,5} => syso("array:"+Arrays.toString(arr))
public class GameAdaptive {


    public static void main(String[] args) {
        int[] arr = {1, 3, 6, 1, 3, 6}; //only evin n len //[0,1,3,4,5]
        sumAB(arr);


        //	System.out.println("Hello World");
    }

    public static void sumAB(int[] arr) { //lets try not adaptive first only
        int evenSum = 0;
        int oddSum = 0;
        for (int i = 0; i <arr.length ; i = i+2) { //jumping 2 complexity
            evenSum+=arr[i];
            oddSum+=arr[i+1];

        } //hanaha anhnu yodim eifo adif beathala
        boolean even = true; //flag ehad maspik
        if(evenSum<oddSum){
            even =false;
        }
        int start =0 ;
        int end = arr.length-1;
        //naniah ve nishom mehash
        int new_even = 0;
        int new_odd = 0;
        while(start<end){ //even => zugi
            if(start%2 ==0 && even || start%2==1 && !even ){


            }


        }



    }
}



