class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        helper(nums,
                0,
                res,
                new ArrayList<>());
        return res;
    }
    public void helper(int nums[],int ind,List<List<Integer>> res,List<Integer> st){
        if(ind==nums.length){
            res.add(new ArrayList<>(st));
            return ;
        }
        else{
            st.add(nums[ind]);
            helper(nums,ind+1,res,st);
            st.remove(st.size()-1);
            helper(nums,ind+1,res,st);
        }
    }
}