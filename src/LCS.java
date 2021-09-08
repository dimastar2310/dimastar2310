import java.util.ArrayList;

public class LCS {

    public static void greedyLCS(String x,String y){//x to y
    String res = "";
    int start = 0;
        for (int i = 0; i <x.length() ; i++) {
         int index = y.indexOf(x.charAt(i),start);
         if(index!=-1){ //zot omeret kaemet atama
             start = index +1; //naziz start le index matim
             res+=""+x.charAt(i); //nemale mahrozet leahzara

         }
         //else nitkadem i = i+1 ;
        }

       System.out.println("longist len is "+res.length());
        System.out.println("longest string is"+res);

        }
       // System.out.println("greedy betwen X and Y  = "+x+" and "+y +" is");
      ///  System.out.println("the size is ="+ ans.length());
       // System.out.println("the string is ="+ans );
//O(n+m)
    //y to x only lower case letters
   public static void greedyImproved(String x,String y){
        String ans = "";
        int start = 0;
        int[] arr = new int[26]; //maarah tediruyot
        for (int i = 0; i < y.length() ; i++) {
            arr[y.charAt(i) -'a']++; //kama kol char shel string y mofia
        }

        for (int i = 0; i <x.length() ; i++) {
            int place = x.charAt(i)-'a';
            if(arr[place]>0){
                int index = y.indexOf(x.charAt(i),start);
                arr[place]--;
                ans+=""+x.charAt(i);
                start = index+1;
            }
        }
         //le nishtamesh be kol hahishuvim

System.out.println("the answer is = "+ans);
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






public static void LongestUncommonSubsequence(String X,String Y){ //static bishvil lageshet mi main
        return;
}
public static void LongestContinuesSubsequence(String X,String Y){
    int min_len = Math.min(X.length(),Y.length()); //le haham bediuk ,zarih ladat mi ze mi
    int max_len = Math.max(X.length(),Y.length());
        int ones[] = new int[max_len]; //naase ahadot lefi mahrozet aruka yoter
        int max = 0; //nishmor maximum kol paaam

    //nathil mi index i+1
    //O(n^3) //efshar leyael n*(n+m)
    String ans = "";
    //nehapes maximum aharkah
    int start = 0; //greedy+ones

        for (int j = 0; j <min_len ; j++) { //naniah x youter katan
            char k = X.charAt(j);
            int index = Y.indexOf(k,start);
            if(index!=-1){ //nehpaes maximum aharkah
                ones[index] = ones[index-1]+1;
                start = index+1;
            }
            //else j++ check other char
        }


    //int globmax = 0;
    int p =0; //nikat string meagdola
    int l =0;
    for (int i = 0; i <ones.length ; i++) {
       if(ones[i]>max){
           max = ones[i];
       }
        //max = 0;
    }
    System.out.println("the len  of max continues subarray is "+max);
}

    public static void main(String[] args) {
        String c = "abracdklpd";
        String d= "bkabradlpklpd";
        LongestContinuesSubsequence(c,d);
        String a = "aggtab";
        String b = "gxtayb";
        //be lcs le mahzirim kaha et hamahrozet
        //int k = DP_Lcs(a,b);
       // System.out.println(DP_Lcs(a,b));
        greedyLCS(a,b);
        Lcs_Bruth(a,b);
        greedyImproved(a,b);
        //will going to apply same technice on the matala array list of array list


    }



}
