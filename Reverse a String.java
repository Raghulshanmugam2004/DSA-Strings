//https://www.geeksforgeeks.org/problems/reverse-a-string/1
class Solution {
    public static String reverseString(String s) {
        // code here
        char[] a=s.toCharArray();
        int i=0;
        int j=s.length()-1;
        while(i<=j)
        {
            char c = a[i];
            a[i]=a[j];
            a[j]=c;
            i++;
            j--;
        }
        return new String(a);
    }
}
