//https://www.geeksforgeeks.org/problems/anagram-1587115620/1
class Solution {
    // Function is to check whether two strings are anagram of each other or not.
    public static boolean areAnagrams(String s1, String s2) {

        // Your code here
        if(s1.length()!=s2.length())
        {
            return false;
        }
        int[] res=new int[256];
        for(int i=0;i<s1.length();i++)
        {
            res[s1.charAt(i)]++;
        }
        for(int i=0;i<s2.length();i++)
        {
            res[s2.charAt(i)]--;
        }
        for(int i=0;i<256;i++)
        {
            if(res[i]!=0)
            {
                return false;
            }
        }
        return true;
    }
}
