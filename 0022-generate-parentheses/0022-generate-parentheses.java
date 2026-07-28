class Solution {
    public List<String> generateParenthesis(int n) {
        
        String curr="";
        solve(curr,n);
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
    
    void solve(String curr ,int n){
        if(curr.length()==2*n){
            if(isvalid(curr)){
                res.add(curr);
            }
            return;
        }
        
        solve(curr+'(', n);
        

        
        solve(curr+')',n);
        
    }
}