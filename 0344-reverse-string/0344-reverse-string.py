class Solution(object):
    def reverseString(self, s):
        
        """
        :type s: List[str]
        :rtype: None Do not return anything, modify s in-place instead.
        """
        n=len(s)
        i=0
        j=len(s)-1
        
               
        while i<j:
            temp=s[j]
            s[j]=s[i]
            s[i]=temp
            i+=1
            j-=1
        print(s)             
                                
                               
               


            

        