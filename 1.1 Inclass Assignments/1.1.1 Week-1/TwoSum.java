class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int elem;
        for(int i=0;i<nums.length;i++){
            elem = target-nums[i];
            if(map.containsKey(elem))
                return new int[]{i,map.get(elem)};
            
            
            map.put(nums[i],i);
        }
        
        
        return new int[]{};
        
    }
}
