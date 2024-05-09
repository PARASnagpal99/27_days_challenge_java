class Solution {
public:
    int bs(vector<int>&temp , int nums){
        int l = 0 , r = temp.size() - 1 ;
        int ans = r ;
        while(l <= r){
            int mid = l + (r-l)/2 ;
            if(nums <= temp[mid]){
                ans = mid ;
                r = mid-1 ;
            }else{
                l = mid+1 ;
            }
        }
        return ans ;
    }
    
    
    
    
    int lengthOfLIS(vector<int>& nums) {
        int n = nums.size() ;
        
        vector<int> temp ;
        
        for(int i=0 ; i<n ; ++i){
            if(temp.empty() or (!temp.empty() && temp.back() < nums[i])){
                temp.push_back(nums[i]);
            }else{
                int indx = bs(temp , nums[i]);
                temp[indx] = nums[i];
            }
        }
        
        return temp.size();
        
        
        
        
    }
};
