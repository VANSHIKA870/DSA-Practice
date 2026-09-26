class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int mid=nums.length/2;
        Set<Integer>set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(i!=mid){
                set.add(nums[i]);
            }
        }


        return !set.contains(nums[mid]);
        
        
    }
}