import My_Library.MyLybrary;

public class Game_DP {




    public static void main(String[] args) {
     int[] arr= {1,3,6,1,3,6};
     best_price(arr);

    }

    public static int[][] best_price(int[] a) {
        int[][] mat=new int[a.length][a.length];
        for (int i = 0; i < mat.length; i++) {
            mat[i][i]=a[i];
        }
        for (int i = mat.length-2; i >= 0; i--) {
            for (int j =  i+1; j < mat.length ; j++) {
                mat[i][j]=Math.max(a[i] - mat[i+1][j],a[j]-mat[i][j-1]);
            }
        }
        MyLybrary.printIntMatrix(mat);
        System.out.println("the best price is = "+ mat[0][mat.length-1]);
        return mat;
    }
}
