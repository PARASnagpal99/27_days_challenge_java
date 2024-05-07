class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
            List<Integer> temp = new ArrayList<>() ;
            int l = 0 , r = 0 ;
        
            while(l < m && r < n){
                if(nums1[l] <= nums2[r]){
                    temp.add(nums1[l]);
                    l++;
                }else{
                    temp.add(nums2[r]);
                    r++;
                }
            }
           
            while(l < m){
                temp.add(nums1[l]);
                l++;
            }
        
            while(r < n){
                temp.add(nums2[r]);
                r++;
            }
        
            for(int i=0 ; i<m + n ; ++i){
                nums1[i] = temp.get(i);
            }
        
    }
}
