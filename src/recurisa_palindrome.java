public class recurisa_palindrome {



    public static boolean isPalindrome(String s) {
        boolean ans = false;
        if (s.length() == 0 | s.length() == 1) {
            ans = true;
        } else if (s.charAt(0) == s.charAt(s.length() - 1)) {
            // System.out.println("iam at else if caunt is"+caunt++);
            ans = isPalindrome(s.substring(1, s.length() - 1));
        }
        return ans;
    }














public static boolean isPalindrome1(String str){
        if(str.length()==1){
            return true;
        }
        else if(str.charAt(0)!=str.charAt(str.length()-1)){
            return false;
        }
        return isPalindrome(str.substring(1,str.length()-1));

}

    public static void main(String[] args) {
        String str = "dented";
        String str1 = "rooooor";
        String str2 = "aaaaaaaaAaaa";


        System.out.println(isPalindrome(str1));
        System.out.println(isPalindrome1("detked"));
    }


}
