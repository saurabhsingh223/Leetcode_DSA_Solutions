class Solution {
    public String reverseWords(String s) {
        s = s.trim();  // removes leading & trailing spaces
        
        // split on 1 or more spaces
        String[] arr = s.split("\\s+");

        StringBuilder sb = new StringBuilder();

        for (int i = arr.length - 1; i >= 0; i--) {
            sb.append(arr[i]);
            if (i != 0) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
