class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int prefix=0;;
        int count=0;
        int[] freq=new int[k];
        freq[0]=1;
        for(int num:nums){
            prefix+=num;
            int rem=prefix%k;
            if(rem<0){
                rem+=k;
            }
            count+=freq[rem];
            freq[rem]++;
        }
        return count;
        
    }
}