import java.util.Arrays;

public class GlassBallsProb {

    public static void main(String[] args) {
        int n = 10;
        glass_balls(n);
    }

    private static void glass_balls(int n) {
        int f[] = new int[n+1];

        f[0] = 0;f[1]=1;f[2] = 2; //basis

        for (int i = 3; i <n ; i++) {
            int min =i; //koma minimalit

            for (int j = 1; j <i ; j++) { //mathilim livdok mi koma rishona a koma ahat pahot le oto mikta
                int x = Math.max(j,f[i-j]+1);
                if(x<min){
                    min = x;
                }
            }
            f[i] = min;


        }
        System.out.println(Arrays.toString(f));
    }


}
