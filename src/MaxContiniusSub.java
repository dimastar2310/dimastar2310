class MaxSumContinius {

static int notcadan_compare =0;
static int cadans_compare = 0;
    public static void main(String[] args) {
        int arr[] = {-2,2,5,-11,6};
        notcadan(arr);
        cadans(arr);
    }

    private static void cadans(int[] arr) {
        int current_sum = arr[0]; //current j sum
        int global_sum = Integer.MIN_VALUE; //global i and j sum
        for (int i = 1; i < arr.length; i++) {
            //do we consider adding new element with lest subsequence
            //or we consider start new subsequence
            current_sum = Math.max(current_sum + arr[i],arr[i]);
            //choosing maximim
            global_sum = Math.max(global_sum,current_sum);

        }
        System.out.println("candans algo is  maximim is = "+global_sum);

    }

    private static void notcadan(int[] arr) {
        int MS = 0; //current j sum
        int GMS = Integer.MIN_VALUE; //global i and j sum
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i; j <arr.length ; j++) {
                MS = MS +arr[j];
                notcadan_compare++;
                if(MS>GMS){

                    GMS = MS;
                }
            }
            MS = 0; //iam zero my MaxSum in current iteration
        }
        System.out.println("max continius sum is = "+GMS);
        System.out.println("comaprison n^2? ="+notcadan_compare);

    }
}
