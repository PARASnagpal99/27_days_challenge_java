class Solution {
    public void swap(int[][] matrix , int i , int j){
           int temp = matrix[i][j] ;
           matrix[i][j] = matrix[j][i] ;
           matrix[j][i] = temp ;
    }
    
    public void reverse(int[] arr , int l , int r){
           while(l < r){
               int temp = arr[l] ;
               arr[l] = arr[r] ;
               arr[r] = temp ;
               l++;
               r--;
           }
    }
    
    
    public void rotate(int[][] matrix) {
           int n = matrix.length , m = matrix[0].length ;
        
           for(int i=0 ; i<n ; ++i){
               for(int j=0 ; j<i ; ++j){
                   swap(matrix , i , j);
               }
           } 
        
           for(int i=0 ; i<n ; ++i){
               reverse(matrix[i] , 0 , m-1);
           }
        
    }
}
