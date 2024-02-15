class Solution {
    int cnt = 0;
    public int findTargetSumWays(int[] nums, int target) {
        help(nums,0,target);
        return this.cnt;
    }
    public void help(int nums[],int ind,int target){
        if(ind==nums.length){
            if(target==0){
                this.cnt++;
            }
            return ;
        }
        else{
            help(nums,ind+1,target-nums[ind]);
            help(nums,ind+1,target+nums[ind]);
        }
    }
}