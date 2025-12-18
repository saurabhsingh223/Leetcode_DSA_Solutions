class Solution {
    public String longestPalindrome(String s) {
        String ans = "";
        for(int i = 0; i<s.length(); i++){
            for(int j = i; j<s.length(); j++){
                if(isPalindrome(s, i, j)){
                    if(subLen(s, i, j) > ans.length()){
                        ans = s.substring(i, j+1);
                    }
                }
            }
        }
        
        return ans;
    }
    static boolean isPalindrome(String s, int i, int j){
        while( i <= j ){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
                i++;
                j--;
        }
        return true;
    }
    static int subLen(String s, int l, int r){
        String len = s.substring(l, r+1);
        return len.length();
    }
}