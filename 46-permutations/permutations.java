class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Map<Integer,Boolean> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(i,false);
        }
        help(nums,
            new ArrayList<>(),
            res,
            map);
        return res;
    }
    public void help(int nums[],List<Integer> st,List<List<Integer>> res,Map<Integer,Boolean> map){
        for(int i=0;i<nums.length;i++){
            if(map.get(i)==false){
                st.add(nums[i]);
                map.put(i,true);
                help(nums,st,res,map);
                st.remove(st.size()-1);
                map.put(i,false);
            }
        }
        if(st.size()==nums.length) res.add(new ArrayList<>(st));
    }
}