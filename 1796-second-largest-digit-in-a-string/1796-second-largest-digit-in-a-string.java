class Solution {
    public int secondHighest(String s) {
        int largest=-1;
        int sl=-1;
        for(char ch:s.toCharArray()){
            if(Character.isDigit(ch)){
                int digit=ch-'0';
                if(digit>largest){
                    sl=largest;
                    largest=digit;
                }
                 else if(digit>sl && digit<largest){
                    sl=digit;
                }
            }
            

            
        }
        return sl;
        
    }
}