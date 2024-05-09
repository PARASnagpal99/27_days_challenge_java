class Solution {
    public int lengthOfLIS(int[] nums) {
           int n = nums.length ;
        
           List<Integer> dp = new ArrayList<>(Collections.nCopies(n , 1));
          
           int ans = 0 ;
        
        
           for(int i=0 ; i<n ; ++i){
               for(int j=0 ; j<i ; ++j){
                   if(nums[j] < nums[i]){
                       int mxm = Math.max(dp.get(i) , 1 + dp.get(j));
                       dp.set(i , mxm);
                   } 
               }
               ans = Math.max(ans , dp.get(i));
           }
        
        
           return ans ;
        
    }
}
