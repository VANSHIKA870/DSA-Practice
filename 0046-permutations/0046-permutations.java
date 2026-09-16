class Solution {
    List<List<Integer>> result=new ArrayList<>();

    public void Solve(List<Integer> temp, int[] nums, Set<Integer> st){
       
        if(temp.size()==nums.length){
             result.add(new ArrayList<>(temp));
             return;
        }
        for(int i=0;i<nums.length;i++){
            
            if(st.contains(nums[i])){
                continue;
            }
                st.add(nums[i]);
                temp.add(nums[i]);
                Solve(temp,nums,st);
               
                temp.remove(temp.size()-1);
                st.remove(nums[i]);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        Set<Integer> st=new HashSet<>();
        List<Integer> temp=new ArrayList<>();
        

        Solve(temp,nums,st);

        return result;
        
    }
}