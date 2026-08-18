class Solution(object):
    def minSubArrayLen(self, target, nums):
        """
        :type target: int
        :type nums: List[int]
        :rtype: int
        """
        res=float('inf')
        left=0
        total=0

        for right in range (len(nums)):
            total=total+nums[right]
            while total>=target:
                res=min(res,right-left+1)
                total=total-nums[left]
                left=left+1
            
           
                
               
        
        if res==float('inf'):
            return 0
        return res    