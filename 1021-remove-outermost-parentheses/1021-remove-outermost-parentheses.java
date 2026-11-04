class Solution {
    public String removeOuterParentheses(String s) {
        int count=0;
        String a="";
        for(int i=0;i<s.length();i++){
            char t=s.charAt(i);
            if(t=='('){
                if(count!=0){
                    a=a+t;
                }
                count++;
            }
            if(t==')'){
                count--;
                if(count!=0){
                    a=a+t;
                }
            }        
        }
        return a;
    }
}