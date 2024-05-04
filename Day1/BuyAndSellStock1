class Solution {
    public int maxProfit(int[] prices) {
           int n = prices.length ; 
            
           int mnm = Integer.MAX_VALUE ;
           int ans = 0 ;   
        
           for(int i : prices){
               ans = Math.max(ans , i - mnm);
               mnm = Math.min(mnm , i);
           }
        
           return ans ;
         
    }
}
