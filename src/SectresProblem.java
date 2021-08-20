import java.util.Arrays;

public class SectresProblem {

    public static void main(String[] args) {
        int arr[] = {3,6,1,8,10} ; //maarah tipulim le hamtana

        double ave = aveg(arr);



    }
    public static double aveg(int times[]){
        Arrays.sort(times);
        double avg = 0;
        for(int x:times){
            avg = avg + avg + x;

        }
        return  avg/times.length;




    }



}
