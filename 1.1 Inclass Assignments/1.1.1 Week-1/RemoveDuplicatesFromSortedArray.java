class Solution {
    public int removeDuplicates(int[] nums) {
        int i,t = 0;
        
        for(i=1;i<nums.length;i++){
            if(nums[t] != nums[i]){
                t++;
                
                nums[t] = nums[i];
            }
            
        }
        return t+1;
    }
}
