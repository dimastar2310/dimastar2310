import java.util.Arrays;

public class Compiler_Problem {


    public static void main(String[] args) {
        int arr[] = {1,10,8};
        int avg_best_time = waiting_T(arr);
        System.out.println("avg best time by definition is ="+ avg_best_time);
    }

    private static int waiting_T(int[] arr) {

        Arrays.sort(arr);
        int n= arr.length;
        int avg = 0;
        for (int i = 0; i < arr.length; i++) {
            avg += n*arr[i];
            n--;
        }
        return  avg;
    }
}
