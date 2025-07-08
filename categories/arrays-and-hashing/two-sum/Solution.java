class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> numberExists = new HashMap<>();      
        
        for(int i=0; i<nums.length; i++) {
            numberExists.put(nums[i], i);
        }
    
        for(int i=0; i<nums.length; i++) {
            int complement = target - nums[i];
            Integer position_of_complement = numberExists.get(complement);
            if(position_of_complement != null) {
                result[0]=i;
                result[1]=position_of_complement;
                break;
            }
        }
        return result;
    }
}
