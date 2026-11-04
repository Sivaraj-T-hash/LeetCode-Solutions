class Solution {
    public int repeatedNTimes(int[] nums) {
        int n=nums.length/2;
        int hash[]=new int[10001];
        for(int i=0;i<nums.length;i++){
            hash[nums[i]]++;
        }
        int num=-1;
        for(int i=0;i<nums.length;i++){
            if(hash[nums[i]]==n){
                num=nums[i];
            }
        }
        return num;
    }
}