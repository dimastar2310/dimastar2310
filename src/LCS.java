public class LCS {

    public static void greedyLCS(String x,String y){//x to y
        int start = 0;
        String ans = "";
        int xl = x.length();
        int yl = y.length();
        int ind = 0;
        boolean out= true;
        //boolean bigout = true;
        for (int i = 0; i <xl  ;  i++) {//zarih lishmor gam index
            char k = x.charAt(i);
            out = !out;
            for (int j=ind; j <yl && out ; j++) {

                 ind = y.indexOf(k,ind); //hahel mi makom kolshehu
                //will start from the place from where we stoped in y string
                if(ind !=-1){
               ans+=k;
               ind = ind +1; //nitkadem ehad yamina
                    out = !out;
                }
                else //if there is no match will try from other index
                {
                    out = !out;
                }
            }


        }
        System.out.println("greedy betwen X and Y  = "+x+" and "+y +" is");
        System.out.println("the size is ="+ ans.length());
        System.out.println("the string is ="+ans );
    }
    void greedyImproved(String x,String y){
        String ans = "";

        int[] arr = new int[26]; //maarah tediruyot
        for (int i = 0; i < x.length() ; i++) {
            arr[x.charAt(i) -'a']++;
        }
        for (int i = 0; i <y.length() ; i++) {
            int k = y.charAt(i)-'a';
            if(arr[k]!=0){
                arr[k]--;
                ans+=""+y.charAt(i);
            }
        }



        //return ans;
    }
   public static int DP_Lcs(String x,String y){ //lets bring lenght first
        String res ="";
        int n = x.length()+1;
        int m = y.length()+1;
        int mlen =0;
        int[][] arr  = new int[n][m];
        //dont think its nessery to
       //we asume that empty string is there 0 in row and call
       for (int i = 1; i < n ; i++) {
           for (int j = 1; j <m; j++) {
               if(x.charAt(i-1)==y.charAt(j-1)){
                 arr[i][j]=arr[i-1][j-1]+1; //bodkim haym bamahrozet naniah tavnit shel maarah shavot
                   //smola ehad lemala ehad
               }
               else
               {
                   //aheret nivhar lemaala o smola maximum
                   arr[i][j] = Math.max(arr[i][j-1],arr[i-1][j]); //maximim bijection between first to second or visversa
               }
           }
       }
        return arr[n-1][m-1];
   }








    public static void main(String[] args) {
        String a = "AGGTAB";
        String b = "GXTAYB";
        //int k = DP_Lcs(a,b);
        System.out.println(DP_Lcs(a,b));
        greedyLCS(a,b);

    }



}
