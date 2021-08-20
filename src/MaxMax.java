public class MaxMax {

//yohas method
public static void main(String[] args) {
    int arr[] = {3,8,9,5,3,10};
    Max1_Max2_Yoha(arr);
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
