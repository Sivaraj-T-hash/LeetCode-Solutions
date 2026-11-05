class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count=0;
        for(int i=0;i<arr1.length;i++){
            int c=0;
            for(int j=0;j<arr2.length;j++){
                int t=arr1[i]-arr2[j];
                if(t<0){
                    t=t*-1;
                }
                if(t<=d){
                    c++;
                    break;
                }
            }
            if(c==0){
                count++;
            }
        }
        return count;
    }
}