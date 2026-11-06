class Solution {
    public void reverseString(char[] s) {
        int l=s.length;
        for(int i=0 ;i<s.length/2;i++){
            char t = s[i];
            s[i]=s[l-1];
            s[l-1]=t;
            l--;
        }
        
    }
}