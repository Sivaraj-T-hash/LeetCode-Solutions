class Solution {
    public int balancedStringSplit(String s) {
        int count=0,l=0,r=0;
        for(int i=0;i<s.length();i++){
            char t=s.charAt(i);
            if(t=='R'){
                r++;
            }
            else{
                l++;
            }
            if(l==r){
                count++;
            }
        }
        return count;
    }
}