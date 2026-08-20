class Solution(object):
    def fib(self, n):
        """
        :type n: int
        :rtype: int
        """
        dp=[0]*(n+1)
        def fibo(dp,n) :
            if n<2:
                return n
            if dp[n]!=0:
                return dp[n]

            dp[n]=fibo(dp,n-1)+fibo(dp,n-2)

            return dp[n]

        return fibo(dp,n)  
                 
    

    
        