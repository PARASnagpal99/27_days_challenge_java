class Solution {
    public int maxSubArray(int[] nums) {
           int n = nums.length ;
        
           int ans = nums[0] ;
        
           int sum = nums[0] ;
        
        
           for(int i=1 ; i<n ; ++i){
               sum = Math.max(nums[i] , sum + nums[i]);
               ans = Math.max(ans , sum);
           }
        
           return ans ;
    }
}
