import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {
  static ArrayList<Integer> p = new ArrayList<>();
    public static void main(String[] args) {
        int a[] = {3, 8, 15, 20};
        int b[] = {1, 5, 7, 10};
        //int[] c = merge(a, b);
        int k[] = {12,6,2,5,10,6,1};
        //mergesort(k);
        mergesort2(k);
        System.out.println(Arrays.toString(k));
        System.out.println(p);
    }
    static void mergesort2(int arr[]) {
        int n = arr.length;
        if (n < 2) {
            p.add(arr[0]);
            return;
        }
        int mid = n -1;
        int left[] = new int[mid];
        int right[] = new int[n - mid];
        for (int i = 0; i < mid; i++)
            left[i] = arr[i];
        for (int i = mid; i < n; i++)
            right[i - mid] = arr[i];
        mergesort2(left);
        mergesort2(right);
        merge(arr, left, right);
    }
     //ani yahol laasot mashu simetri le forim
    static void mergesort(int arr[]) {
        int n = arr.length;
        if (n < 2)
            return;
        int mid = n / 2;
        int left[] = new int[mid];
        int right[] = new int[n - mid];
        for (int i = 0; i < mid; i++)
            left[i] = arr[i];
        for (int i = mid; i < n; i++)
            right[i - mid] = arr[i];
        mergesort(left);
        mergesort(right);
        merge(arr, left, right);
    }

    public static void merge(int arr[], int left[], int right[]) {
        int nL = left.length;
        int nR = right.length;
        int i = 0, j = 0, k = 0;
        while (i < nL && j < nR) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < nL) {
            arr[k] = left[i];
            i++;
            k++;
        }
        while (j < nR) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }

//    private static void merge(int[] k, int low, int mid, int high) {
//    }
//    //now we need to midificate our merge sort for that
//
//    private static int[] merge(int[] a, int[] b) {
//
//        int i = 0, j = 0, n = a.length - 1, m = b.length - 1, k = 0;
//        int c[] = new int[n + m];
//        while (i < n && j < m) {
//            if (b[j] < a[i]) {
//                c[k++] = b[j++];
//            } else //b[j]>a[i]
//            {
//                c[k++] = a[i++];
//            }
//
//        }
//        while (i < n) {
//            c[k++] = a[i++];
//        }
//        while (j < m) {
//            c[k++] = b[j++];
//        }
//
//
//        return c;
//    }
}
