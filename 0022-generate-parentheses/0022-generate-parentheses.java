class Solution {
    public List<String> generateParenthesis(int n) {
        int open=0;
        int close=0;
        String curr="";
        solve(curr,n,open,close);
        return res;

    }
        boolean isvalid(String str){
            int count=0;
            for(char ch:str.toCharArray()){
                if(ch=='('){
                     count++;
                }else{
                    count--;
                }
                if(count<0){
                    return false;
                }
            }
            return count==0;
           
        }   
        List<String> res=new ArrayList<>();
    
    void solve(String curr ,int n,int open ,int close){
        if(curr.length()==2*n){
            res.add(curr);
            return ;
        }
            if(open<n){
                solve(curr+'(', n,open+1,close);

            }
            if(close<open){
                solve(curr+')', n,open,close+1);

            }
            
    
        
    }
}