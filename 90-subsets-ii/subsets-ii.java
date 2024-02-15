class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        helper(nums,
                0,
                res,
                new ArrayList<>());
        return res;
    }
    public void helper(int nums[],int ind,List<List<Integer>> res,List<Integer> st){
        res.add(new ArrayList<>(st));
        for(int i=ind;i<nums.length;i++){
            if(i!=ind && nums[i]==nums[i-1]) continue;
            st.add(nums[i]);
            helper(nums,i+1,res,st);
            st.remove(st.size()-1);
        }
    }
}