class Solution {
    public String longestPalindrome(String s) {
        int start=0;
        int maxlen=1;
        if(s==null && s.length()<2){
            return s;
        }
        for(int i=0;i<s.length();i++){
            int left=i;
            int right=i;
            while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right) ){
                int currlen=right-left+1;
                if(currlen>maxlen){
                    maxlen=currlen;
                    start=left;
                }
                left--;
                right++;
            }
            left=i;
            right=i+1;
            while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right) ){
                int currlen=right-left+1;
                if(currlen>maxlen){
                    maxlen=currlen;
                    start=left;
                }
                left--;
                right++;
            }

        }
        return s.substring(start,start+maxlen);
        
        
       
        
    }
}