class Solution {
    public String defangIPaddr(String address) {
        String ans="";
        int len=address.length();
        for(int i=0;i<len;i++){
            char t=address.charAt(i);
            if(Character.isDigit(t)){
                ans=ans+t;
            }
            else if(t=='.'){
                ans=ans+"[.]";
            }
        }
        return ans;
    }
}