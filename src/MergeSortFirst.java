//package Lesson_2_MergeSort;

import java.util.Arrays;
import My_Library.MyLybrary;

public class MergeSortFirst {
    public static void mergeSort(int arr[]){// O(n*log(n))
        mergeSort(arr, 0, arr.length);
    }
    public static void mergeSort(int arr[], int low, int high){
        // sort a[low, high)
        //if (n <= 1) return;
        if (low < high-1){
            int mid = (low + high)/2;
            mergeSort(arr, low, mid);//a[low, mid)
            mergeSort(arr, mid, high);//a[mid, high)
            int n = high - low;
            int [] temp = new int[n];
            int i = low, j = mid, k=0;
            // merge two arrays: arr[low, mid), arr[mid, high)
            while(i<mid && j<high){
                if (arr[j] < arr[i]) temp[k++] = arr[j++];
                else  temp[k++] = arr[i++];
            }
            while (i<mid) temp[k++] = arr[i++];
            while (j<high) temp[k++] = arr[j++];
            // retrieve temp to source array
            for(int p=0; p<n; p++) arr[low + p] = temp[p];
        }
    }
    public static boolean isSorted(int[] a) {
        for (int i = 1; i < a.length; i++)
            if (a[i] < a[i-1]) return false;
        return true;
    }
    public static void main(String[] args) {
        int[]aa= {8,10, 6};
        mergeSort(aa);
        int size = 10000000;
        int[] a = MyLybrary.randomIntegerArray(size);

        int []b = Arrays.copyOf(a, size);
        long  timeBefore = System.currentTimeMillis();
        mergeSort(b);
        long timeAfter = System.currentTimeMillis();
        System.out.println("MergeSort time = " + (timeAfter-timeBefore)/1000.0+"seconds");
        System.out.println("is sorted? "+isSorted(b));

        // java Sort
        b = Arrays.copyOf(a, size);
        timeBefore = System.currentTimeMillis();
        Arrays.sort(b);
        timeAfter = System.currentTimeMillis();
        System.out.println("Java Sort time = " + (timeAfter-timeBefore)/1000.0 +" seconds");
        System.out.println("is sorted? "+isSorted(b));
    }

}