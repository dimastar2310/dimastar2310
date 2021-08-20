public class Min_Max { //good for sidra ola 1,2,3,4,5,6,7,8


    public static void main(String[] args) { //good comparison is #1 for each bed #2


        int arr[] = {1,2,3,4,5,6,7};

        min_max(arr);

    }
    static int comparisons = 0;
    private static void min_max(int[] arr) {
        //int comparisons =0;
        int min = Math.min(arr[0],arr[1]);
        int max = Math.max(arr[0],arr[1]);
        comparisons+=2;

        for (int i = 2; i <arr.length ; i++) {
            if(arr[i]>max){//if hes bigger then maxim a(min)<a(max) then he defently bigger then min
                //and thats enough
                max = arr[i];
                comparisons+=1;
            }
            else if(arr[i]<min){
                min = arr[i];
                comparisons+=2; //le ikanes le if aval hahashvaa buza
            }
        }
        System.out.println("comparisons for  arr = "+comparisons);
        System.out.println("our max is ="+max);
        System.out.println("our min is "+min);

    }

}
