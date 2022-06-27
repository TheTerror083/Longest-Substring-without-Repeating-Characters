package longestSubstring;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int longest = 0;
        int curr = 0;
        int i = 0;
        String currStr = "";
        while(i < s.length()){
            if(currStr.indexOf(s.charAt(i)) < 0)
            {
                curr++;
            }
            else{
                curr = 1;   // resetting the counter, adding one to count the first letter of the new substring                                 with the current letter.
                currStr = "";
            }
           if(curr > longest)
           {
                longest = curr;
           }
           currStr = currStr + s.charAt(i);
           i++;
        }
        return longest;
    }
}