public class NotEvenOddStrategy {

    public static void main(String[] args) {
        int[] arr = {1,8,11,9,2,7};

        regAb(arr);
    }

    private static void regAb(int[] arr) {
        int AliceResult = 0;
        int BobResult = 0;
        int begin = 0;
        int end = arr.length-1;
        while (begin<=end){
            //alice choose first
            if(arr[begin]>arr[end]){
               AliceResult+=arr[begin++];

            }
            else //seond lim is bigger
            {
                AliceResult+=arr[end--];

            }
            //bob choose
            if(arr[begin]>arr[end]){
                BobResult+=arr[begin++];

            }
            else
            {
                BobResult+=arr[end--];

            }
        }
        System.out.println("Alice result  = "+AliceResult);
        System.out.println("Bob result = "+BobResult);
    }
}
