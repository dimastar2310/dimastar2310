package My_Library;//package Lesson_2_MergeSort;
//sifria shel elizabeth
public class MyLybrary {
    /**
     * print character array
     */
    public static void printCharArray(char [] arr){
        for(int t=0; t<arr.length; t++){
            System.out.print(arr[t]+", ");
        }
        System.out.println();
    }
    /**
     * print integer array
     */
    public static void printIntegerArray(int [] arr){
        for(int t=0; t<arr.length; t++){
            System.out.print(arr[t]+", ");
        }
        System.out.println();
    }
    /**
     * print matrix
     */
    public static void printIntMatrix(int [][] mat){
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[0].length; j++){
                System.out.print(mat[i][j]+", ");
            }
            System.out.println();
        }
    }
    /**
     * print double array
     */
    public static void printDoubleArray(double [] arr){
        for(int t=0; t<arr.length; t++){
            System.out.print(arr[t]+", ");
        }
        System.out.println();
    }
    /**
     * returns character array of given size;
     * random characters are the first numOfLetters letters of
     * the alphabet
     */
    public static char [] randomCharArray(int size, int numOfLetters){
        char []arr = new char[size];
        for(int i=0; i<arr.length; i++){
            int x = (int)(Math.random()*numOfLetters+'a');
            arr[i] = (char)x;
        }
        return arr;
    }
    /**
     * returns integer array of given size;
     * random number are into the interval [0,size-1]
     */
    public static int [] randomIntegerArray(int size){
        int []arr = new int[size];
        for(int i=0; i<arr.length; i++){
            arr[i] = (int)(Math.random()*size);
        }
        return arr;
    }
    /**
     * returns integer array of given size;
     * random number are into the interval [0,size-1]
     */
    public static double [] randomDoubleArray(int size){
        double []arr = new double[size];
        for(int i=0; i<arr.length; i++){
            arr[i] = Math.random();
        }
        return arr;
    }
    public static int [] seqIntegerArray(int size){
        int []arr = new int[size];
        for(int i=0; i<arr.length; i++){
            arr[i] = i;
        }
        return arr;
    }
    /**
     * returns integer array of given size;
     * random number are into the interval [-size,size-1]
     */
    public static int [] randomIntegerArray2(int size){
        int []arr = new int[size];
        int size2 = 2*size;
        for(int i=0; i<arr.length; i++){
            arr[i] = (int)(Math.random()*size2 - size);
        }
        return arr;
    }
    public static void shuffle(int[]arr){
        for(int i=0; i<arr.length; i++){
            int ind = (int)(Math.random()*arr.length);
            swap(arr, i,ind );
        }
    }
    public static int minArr(int[]arr){
        int ans = arr[0];
        for(int i=1; i<arr.length; i++){
            if (ans>arr[i])  ans = arr[i];
        }
        return ans;
    }
    public static int maxArr(int[]arr){
        int ans = arr[0];
        for(int i=1; i<arr.length; i++){
            if (ans<arr[i])  ans = arr[i];
        }
        return ans;
    }
    public static int [] randomIntArrayOfDiffNumbers(int size){
        int []arr = new int[size];
        for(int i=0; i<arr.length; i++){
            arr[i] = i;
        }
        shuffle(arr);
        return arr;
    }
    public static boolean contains(int [] arr, int end, int value){
        boolean ans = false;
        for(int i=0; !ans &&i<=end; i++){
            if (arr[i]==value) ans = true;
        }
        return ans;
    }
    /**
     * Binary search by induction
     * @param arr - sorted array of integer numbers
     * @param value to search
     * @return index of value if found, otherwise return -1
     */
    public static int binarySearchInducion(int []arr,int value){
        int low = 0, high = arr.length-1;
        while (low <=high){
            int middle = (low + high)/2;
            if (low == high) {
                if (arr[low] == value) return low;
                else return -1;
            }
            else {
                if (arr[middle] == value){//value was found
                    return middle;
                }
                // value suppose to be left
                if (value < arr[middle]){
                    high = middle;
                }
                // value suppose to be right
                else{
                    low = middle+1;
                }
            }
        }
        return -1;
    }

    public static int[][] matrixSqMulti(int[][] m1, int m2[][]){
        int len=m1.length;
        int res[][] = new int[len][len];
        for(int i=0; i<len; i++){
            for(int j=0; j<len; j++){
                res[i][j] = 0;
                for(int k=0; k<len; k++){
                    res[i][j] = res[i][j] + m1[i][k]*m2[k][j];
                }
            }
        }
        return res;
    }
    public static void bubbleSort(int[] arr){
        boolean flag = true;
        for (int i=0; flag && i <arr.length; i++){
            flag = false;
            for (int j=0; j < arr.length-1-i; j++){
                if(arr[j] > arr[j+1]){
                    flag = true;
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void bubbleSortReverse(int[] arr){
        boolean flag = true;
        for (int i=0; flag && i <arr.length; i++){
            flag = false;
            for (int j=arr.length-1; j>i ; j--){
                if(arr[j-1] < arr[j]){
                    flag = true;
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
    public static void swap(int [] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static boolean isSorted(int[] a) {
        for (int i = 1; i < a.length; i++)
            if (a[i] < a[i-1]) return false;
        return true;
    }
    public static void main(String[] args) {
/*		int mat1[][] = {{1,1},{1,0}};
		int mat2[][] = {{3,2},{2,1}};
		int res[][] = matrixSqMulti(mat1, mat2);
		printIntMatrix(res);
		printIntegerArray(randomIntArrayOfDiffNumbers(6));
*/
        int arr[]=randomIntegerArray(10);
        //int arr[]={63, 71, 19, 33, 71, 93, 5, 90, 25, 17};
        printIntegerArray(arr);
        bubbleSortReverse(arr);
        printIntegerArray(arr);
    }
}
