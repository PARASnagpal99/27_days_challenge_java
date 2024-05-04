class Solution {
    public void swap(int[] nums , int i , int j){
           int temp = nums[i] ;
           nums[i] = nums[j] ;
           nums[j] = temp ;
    }
    
    public void reverse(int[]nums , int l , int r){
           while(l <= r){
               swap(nums , l , r);
               l++;
               r--;
           }
    }
    
    
    public void nextPermutation(int[] nums) {
           int n = nums.length ;
        
           int indx = -1 ;
        
           for(int i = n-2 ; i >= 0 ; i--){
               if(nums[i] < nums[i+1]){
                   indx = i ;
                   break ;
               }
           }
        
           if(indx == -1){
              int l = 0 , r = n-1 ;
              reverse(nums , l , r);
              return ;
           }
        
           for(int i=n-1 ; i > indx ; i--){
               if(nums[i] > nums[indx]){
                   swap(nums , i , indx);
                   break ;
               }
           }
        
           reverse(nums , indx + 1 , n-1);
           return ;
        
    }
}
