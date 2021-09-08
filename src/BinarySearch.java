public class BinarySearch {


    //first with while loops seond rec ,the array must be sorted
    //we want to return the index of the element if exist in log n time complexity

    public static void main(String[] args) {
        int arr[] = {3, 19, 120, 300, 350, 999, 1900, 2000, 2500};
        int x = 3;
        int ind = BS_Not_rec(arr, 2500);
        System.out.println("not rec ind of bs = " + ind);
        //reucrsia
        int ind1 = rec_bs(arr,2500);
        System.out.println("rec = "+ind1);
        int arr2[] = new int[2];
        System.out.println(arr2.length);
        //anahnu mathili indexazia mi 0 az 0 ve az 1 ze 2
          int arr3[] = {3,5,10}; //index0 = 3 index1 = 5 index2 = 10
        System.out.println(arr3.length);
        int mid = 0+ (arr3.length-1-0) /2;
        System.out.println("mid of arr3 is "+mid);
    }

    private static int rec_bs(int[] arr, int x) {
        int start =0,end=arr.length-1,mid=0;
        return rec_bs(start,end,mid,arr,x);
    }

    private static int rec_bs(int s, int e, int m, int []arr,int target) {
        if(s>e) { //im haragnu az tahzir -1
            return -1;
        }
        else
        {
            m = (s+e)/2;
            if(arr[m]==target){
                return m;
            }

            else if(arr[m]<target){ //zarih lalehet yamina
                return rec_bs(m+1,e,m,arr,target);

            }
            else //arr[m]>target anhnu be emza ve matara mismola az lalehet smola

            {
                //holhim smola gvul elion kaet mid
                return rec_bs(s,m-1,m,arr,target);
            }
        }


    }

    private static int BS_Not_rec(int[] arr, int x) {
        int start = 0, end = arr.length - 1, mid = 0;
        while (start <= end) {
            mid = (start+end )/2;
            if (x > arr[mid]) { //x on the right side then
                start = mid + 1;

            }
            //x<arr[mid]
            else//x on the left side then
            {
                end = mid - 1;
            }


        }
       if(arr[start]==x) {
           return start; //returning the index
       }
       //hes not here
        return -1;
}


}
