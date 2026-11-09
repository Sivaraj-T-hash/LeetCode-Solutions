class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> a=new HashSet<>();
        for(int t:nums){
            if(a.contains(t)){
                return true;
            }
            a.add(t);
        }
        return false;
    }
}