class Solution {
    public void moveZeroes(int[] nums) {
        if(nums.length==0 || nums.length==1){
            return;
        }
        int j=0;
        for(int i=0;i<=nums.length-1;i++){
            if(nums[i]!=0){
                int temp; 
                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }
}