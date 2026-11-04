class Solution {
    public int[] diStringMatch(String s) {
        int n=s.length();
        int a[]=new int[n+1];
        int index=0;
        int i=0,d=n;
        for(int j=0;j<n;j++){
            char t=s.charAt(j);
            if(t=='I'){
                a[index]=i;
                i++;
            }
            else{
                a[index]=d;
                d--;
            }
            index++;
        }
        if(s.charAt(n-1)=='I'){
            a[index]=i;
        }
        else{
            a[index]=d;
        }
        return a;
    }
}