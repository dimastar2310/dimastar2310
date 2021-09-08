package Honhut;

public class YaldaKita2 {


    public static void main(String[] args) {
        //int size = 19;
        //Question 2
        int arr[] = {3, -2, 6, 2, 1, 3}; //po uhazr 4
        int arr2[] = {1,2,-2,0,7,3}; //po uhzar -1
        int target = 9;
        int target2 = 11;
        int ind= above(arr,target); //rozim leahzir index
        int ind2 = above(arr2,target2);
        System.out.println("first index bigget then =  " + target + " is " + ind);
        System.out.println("second arr is = "+ ind2);
        //Question 3.a eivar shivion index
        int arr3[] = {-1,7,4,2,3,1};
        int arr4[]= {6,-3,4,2,0,-6,3};
        int target3 = 2;
        int target4 = 0;
        boolean shiv = eivarShiv(arr3,target3);
        boolean shiv1  = eivarShiv(arr4,target4);
        System.out.println("eivar shiv in arr3 in index "+target3+" is shivion?"+shiv);
        System.out.println("eivar shiv in arr4 in index "+target4+" is shivion?"+shiv1);

//kolel
        //question 3.b maarah shivion nishtamesh be eivarShiv funkzia
        boolean maarah_shiv = maarahShiv(arr3);
        System.out.println("haim kayam eivar ehad she hu ose et haamaarah maarah shiv ? " + maarah_shiv);


        }

    private static boolean maarahShiv(int[] arr3) {//nishtamesh be eivarShiv
        boolean res = false;
        for (int i =0;i<arr3.length;i++){
            res = eivarShiv(arr3,i);
            if(res ==true){ //lefahot ehad
                //mazanu oto
                break;

            }
        }
        return  res;

    }

    private static boolean eivarShiv(int[] arr3, int target3) {
        for (int i=0;i<arr3.length;i++){
            int Sum_Smola = 0;
            int Sum_Yamina = 0;
            //mikre2 hariga yamina
            int smola = i-1;
            if(smola!=-1) { //le horgim smola

                while (smola >= 0) {
                    Sum_Smola += arr3[smola];
                    smola--;
                }
            }
             //ein po opzia le else if ze pashut taase yamin

                int yamina = i+1;
                while(yamina!=arr3.length){
                Sum_Yamina+=arr3[yamina++];
                }
            if (Sum_Smola == Sum_Yamina) {
                return true;//ze gam break
            }

            }


            //anahnu zrihim le kolel

           return false; //aheret ein
        }


    private static int above(int[] arr,int target) {
        int globalSum = 0;
        int Sum = 0;
        boolean getout = true;
        int first_index_bigget_then_target = 0;
        for (int i = 0;i<arr.length && getout;i++){
            Sum+=arr[i];
            if(Sum>target){
                first_index_bigget_then_target = i;
                getout = false;
            }
        }
        if(getout == true){ //ein kaze index
            return -1;
        }
        //aheret mamshihim
        return first_index_bigget_then_target;
    }
}

