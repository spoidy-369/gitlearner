class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        help(nums,0,res);
        return res;
    }
    public void help(int nums[],int ind,List<List<Integer>> res){
        if(ind==nums.length){
            List<Integer> st = new ArrayList<>();
            for(int i:nums){
                st.add(i);
            }
            res.add(st);
            return;
        }
        for(int i=ind;i<nums.length;i++){
            swap(nums,i,ind);
            help(nums,ind+1,res);
            swap(nums,i,ind);
        }
    }
    void swap(int nums[],int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}