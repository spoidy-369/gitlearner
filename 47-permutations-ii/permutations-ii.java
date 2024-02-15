class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        // List<List<Integer>> res = new ArrayList<>();
        Set<List<Integer>> res = new HashSet<>();
        help(nums,0,res);
        return new ArrayList<>(res);
    }
    public void help(int nums[],int ind,Set<List<Integer>> res){
        if(ind==nums.length){
            List<Integer> st = new ArrayList<>();
            for(int i:nums){
                st.add(i);
            }
            res.add(st);
            return;
        }
        for(int i=ind;i<nums.length;i++){
            if(i!=ind && nums[i]==nums[i-1]) continue;
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