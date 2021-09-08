package Honhut;

import java.util.Scanner;

public class YaldaKita {
    //write a fucntion that gets num <100 and plots all the number between 1 and 100 withoud does that divisible by n

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //declaring object we can get anything from user
        System.out.println("Whats your name?");
        String name = scan.next(); //geting name by defaunt its string
        System.out.println("what number do you want to check for?");
        int k = scan.nextInt(); //cast to int right? direct interaction //we storing the too
        System.out.println("your name is = "+name+" and your data from first function is  ");
         //divWithout3Print(k);
        int sum = divWithout3Res(k);
        System.out.println("the sum is "+sum);
        System.out.println("did you enjoy the program "+name+" ?");
        String answer = scan.next();
        if(answer.equals("yes")){
            System.out.println("horray");
        }
        else
        {
            System.out.println("well see you next time");
        }
        //task 2
        int size = 19;
        int arr[] = new int[size];
        arr[0] = 12;arr[1] = 13;arr[2]=8;arr[3] = 3;arr[4] = 4;
        arr[5] = 7;arr[6] = 12;arr[7] = 15;arr[8]= 55;arr[9]= 12;
        arr[10] = 3;arr[11] =88;arr[12] = 99;arr[13]= 5;arr[14] = 14;
        arr[15] = 25;arr[16] = 30;arr[17] = 45;arr[18] = 77;
        PositiveLessThen(arr);
        System.out.println("lets print the arr");

        printArr(arr);
    }

    private static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    private static void PositiveLessThen(int[] arr) {
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = divWithout3Res(arr[i]);

        }

    }


//that divisible by 3
    private static int divWithout3Res(int k) {
    //sum was asken
        int sum = 0;
        for(int i = 0;i<k;i++){
            if(i%3!=0){
                continue;
            }
            else
            {
                sum+=i;
                //System.out.println(i);
            }
        }
return sum;
    }

}
