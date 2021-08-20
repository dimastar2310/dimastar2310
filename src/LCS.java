import java.util.ArrayList;

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
       // System.out.println("greedy betwen X and Y  = "+x+" and "+y +" is");
      ///  System.out.println("the size is ="+ ans.length());
       // System.out.println("the string is ="+ans );
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
    //we dond get copy i guess
    private  static void plus1(int[] bin){ //po nikabel maarahim had memadim
        int size = bin.length-1;
        while(size>=0 && bin[size]==1){
            bin[size--] = 0;
        }
        if(size>=0){
            bin[size] = 1;

        }


    }
    public static ArrayList<ArrayList<Object>> int_comb(int[] arr){

        int n = arr.length;
        //its array java 10+ has var
        var p = new int[n]; //kavua n sheihi nishlah le +1 i mekabelet arr
        int size =(int) Math.pow(2,n) -1;
        ArrayList<ArrayList<Object>> res = new ArrayList<>(size); //ani yodea ma tozaa basof

        for (int i =0;i<size;i++){ //Object kinda size?
            //neathel oto mehadash hashuv
            var temp = new ArrayList<>(); //oto nemala ve nahnis le arraylist du meimadi
            for(int j =0;j<n;j++){ //le amur liot mishane meifo lalehet batahles
                if(p[j]==1){
                    temp.add(p[j]);

                }
            }
            res.add(temp);
            plus1(p);
        }

      return  res; //object array list betoho
    }
    //we working with int arr {0,1,1} and string abc we get bc
    public static String[] all_comb(String x){ //arraylist of char arr
        int n =  x.length();
        //esh po taut gam
        int[] k = new int[n];
        int size = (int)Math.pow(2,n)-1; //yaholiot pahot rishon ze behinam
        String[] al = new String[size];

        for(int i = 0;i<size;i++){ //zarih godel reik gam
           String t = ""; //string to take the string with integer i could use array list
            for (int j = 0; j <n ; j++) {
                if(k[j]==1){
                    t+=x.charAt(j); //with integers we gonna collect this way
                }
            }
            al[i] = t;
            plus1(k);

            }
        return al;
        }


    public static void Lcs_Bruth(String x,String y) {

        //run from short to long better to do ifs here
        //the are 2 queres here detect short and long string take am
        //and take there sizes
        int short_len=0, long_len =0,max_len =0;
        String short_str, long_str = "";
        if (y.length() > x.length()) {  //maarahim she le obekitim po? muzar
            //short_len = x.length();
            //long_len = y.length();
            short_str = x;
            long_str = y;
        }
         else //x.length > y.len
        {
          short_str = y;
          long_str= x;
        }
        String[] tshort = all_comb(short_str);
        String[] tlong = all_comb(long_str);
        int len = 0;
        String ans ="";
        for (int i = 0; i < tlong.length ; i++) {
            len = tshort[i].length(); //will save the lenght of curr string and run on other array of strings
            //if the is biger then new lenghth and equals in string chars will update
            for (int j = 0; j < tlong.length; j++) {
                //tnai dome zarih laasot be matala
                if(tshort[i].equals(tlong[j])&&len >max_len){ //hoshim be ze she le nikanes le po tam
                    max_len = len;
                    ans= tshort[i];
                }
            }
        }

        System.out.println("the LCS string bw : "+x+  " and : " + y+" : is " + ans);
        System.out.println("the len of the res string is  = "+max_len);
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
                  // res+=x.charAt(i-1);
                   //smola ehad lemala ehad
               }
               else
               {
                   //aheret nivhar lemaala o smola maximum
                   arr[i][j] = Math.max(arr[i][j-1],arr[i-1][j]); //maximim bijection between first to second or visversa
               }
           }
       }
       //System.out.println("the string is at dynamic programing is = "+ res);
        return arr[n-1][m-1];
   }








    public static void main(String[] args) {
        String a = "AGGTAB";
        String b = "GXTAYB";
        //be lcs le mahzirim kaha et hamahrozet
        //int k = DP_Lcs(a,b);
       // System.out.println(DP_Lcs(a,b));
        greedyLCS(a,b);
        Lcs_Bruth(a,b);
        //will going to apply same technice on the matala array list of array list


    }



}
