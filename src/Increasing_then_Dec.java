import java.util.ArrayList;

public class Increasing_then_Dec {

    public static void main(String[] args) {
        int arr[]  = {100,3,2,101,200,-7,13,500,-3,17,1,-2};
        long_inc_then_dec(arr);
        int arr1[] = {1,100,2,200,-7,500,-3,17,3};
        long_inc_then_dec(arr1);
    }

    private static void long_inc_then_dec(int[] arr) {
        int temp[] = new int[arr.length];
        ArrayList<Integer> p = new ArrayList<>();
        for (int i = 0; i <arr.length-1 ; i++) {
            if(arr[i]<arr[i+1]){
                p.add(arr[i]);
            }
            else if(arr[i]>arr[i+1]){
                p.add(arr[i]);
            }
            //else ola ola o yoredet yordet
        }
        if(p.get(arr.length-2)!=arr[arr.length-1]) {//she le nahrog{
            p.add(arr[arr.length - 1]);
        }
        System.out.println(p);

    }


}
