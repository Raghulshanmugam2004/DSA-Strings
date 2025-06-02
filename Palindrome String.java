//https://www.geeksforgeeks.org/problems/palindrome-string0817/1
class Solution {
    boolean isPalindrome(String s) {
        // code here
        int i=0,j=s.length()-1;
        char[] a= s.toCharArray();
        while(i<j)
        {
            if(a[i]!=a[j])
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
