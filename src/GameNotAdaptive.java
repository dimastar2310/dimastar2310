public class GameNotAdaptive {
    //even odd strategy
    //dont have to use big resourses like array list
     //not adaptive

    public static void main(String[] args) {
        int arr[] = {5,3,8,10,12,4};
         nadaptSum(arr);
    }

    private static void nadaptSum(int[] arr) { //i know that arr has to be evin
        int evenSum = 0;
        int oddSum = 0;
        for (int i = 0; i <arr.length ; i = i+2) { //jumping 2 complexity
            evenSum+=arr[i];
            oddSum+=arr[i+1];

        }
        boolean even = true;
        if(evenSum<oddSum){
            even = false;
        }
        int playerA = 0; //he choose w/e to go he wants
        int playerB = 0;
        int begin = 0;
        int end = arr.length-1;
        while(end>begin){
            //Alice takes first
            //zugi adif ve index zugi o she i zugi adif ve index i zugi
            if(even && begin%2==0 || !even && begin%2==1){
                playerA+=arr[begin++];
            }
            else //zugi adif ve index i zugi izugi adif ve index zugi
            {
                playerA+=arr[end--];
            }
            //Bob //he chose from whats left and its the maximum the range he given
            if(arr[begin]>arr[end]){
                playerB+=arr[begin++];
            }
            else //the other limit is better
            {
                playerB += arr[end--];
            }

        }
        System.out.println("Alice win is = "+playerA);
        System.out.println("Bob win is = "+playerB);

    }


}
