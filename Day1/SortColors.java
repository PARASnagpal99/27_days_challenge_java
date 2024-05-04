class Solution {
    public void swap(int[] nums , int i , int j){
           int temp = nums[i] ;
           nums[i] = nums[j] ;
           nums[j] = temp ;
    }
    
    
    
    public void sortColors(int[] nums) {
        int n = nums.length ;   
        int l = 0 , r = n-1 ;
        int k = 0 ;
        
        while(k <= r){
            if(nums[k] == 0){
                swap(nums , k , l);
                l++;
                k++;
            }else if(nums[k] == 2){
                swap(nums , k , r);
                r--;
            }else{
                k++;
            }
        }
        
        
        
    }
}
