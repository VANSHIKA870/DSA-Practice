class Solution {
    public int wiggleMaxLength(int[] nums) {
        int n=nums.length;
        if(n==0){
            return 0;
        }
        int max=1;
        for(int i=0;i<n;i++){
            int len=1;
                int prevdiff=0;
            for(int j=i+1;j<n;j++){
                 int diff=nums[j]-nums[j-1];
                if(diff==0){
                    continue;
                }
                if((prevdiff==0)||(prevdiff>0 && diff<0)
                ||(prevdiff<0 && diff>0)){
                    len++;
                    prevdiff=diff;

                }
                
                max=Math.max(len,max);
            }
        }
        return max;
        
    }
}