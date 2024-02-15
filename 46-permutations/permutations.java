class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        boolean vis[] = new boolean[nums.length];
        help(nums,
            new ArrayList<>(),
            res,
            vis);
        return res;
    }
    public void help(int nums[],List<Integer> st,List<List<Integer>> res,boolean vis[]){
        for(int i=0;i<nums.length;i++){
            if(!vis[i]){
                st.add(nums[i]);
                vis[i] = true;
                help(nums,st,res,vis);
                st.remove(st.size()-1);
                vis[i] = false;
            }
        }
        if(st.size()==nums.length) res.add(new ArrayList<>(st));
    }
}