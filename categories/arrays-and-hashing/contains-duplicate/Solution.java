class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> numsSet = new HashSet<Integer>();
        for(int i= 0; i<nums.length; i++) {
            if(numsSet.contains(nums[i])) {
                return true;
            }
            numsSet.add(nums[i]);
        }
        return false;       
    }
}
