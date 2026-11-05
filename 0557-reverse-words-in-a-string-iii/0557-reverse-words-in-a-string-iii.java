class Solution {
    public String reverseWords(String s) {
        String a[]=s.split(" ");
        String ans="";
        for(int i=0;i<a.length;i++){
            StringBuilder t=new StringBuilder(a[i]);
            t.reverse();
            ans=ans+(String.valueOf(t));
            if(i<a.length-1){
                ans+=" ";
            }
        }
        return ans;
    }
}