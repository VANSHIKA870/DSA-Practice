class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        for ch in s:
            if sorted(t)==sorted(s):
                return True
            else:
                return False   
 