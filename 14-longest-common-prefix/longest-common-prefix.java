class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        if (strs.length == 1) return strs[0];

        Arrays.sort(strs);
        String s1 = strs[0];
        String s2 = strs[strs.length - 1];

        StringBuilder res = new StringBuilder();
        for (int i = 0; i < Math.min(s1.length(), s2.length()); i++) {
            if (s1.charAt(i) == s2.charAt(i)) {
                res.append(s1.charAt(i));
            } else {
                break;
            }
        }
        return res.toString();
    }
}

// class Solution {
//     public String longestCommonPrefix(String[] strs) {
//         if(strs.length == 1) return strs[0];
//         Arrays.sort(strs);
//         String s1 = strs[0];
//         String s2 = strs[strs.length - 1];
//         String res = "";
//         int x = 0;
//         int y = 0;
//         while(x < s1.length() && y < s2.length()){
//             if(s1.charAt(x) == s2.charAt(y)){
//                 res += s1.charAt(x);
//                 x++;
//                 y++;
//             }else{
//                 break;
//             }
//         }
//         // if(ans.length() == 0) return -1;
//         return res;
//     }
// }