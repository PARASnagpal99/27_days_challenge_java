class Solution {
    public int func(int i , int j , int n , int m , String word1 , String word2 , int[][]dp){
           if(i == n && j == m) return 0 ;
           if(i == n) return m - j ;
           if(j == m) return n - i ;
           if(dp[i][j] != -1) return dp[i][j] ;
        
        
           if(word1.charAt(i) == word2.charAt(j)){
              int ans = func(i + 1 , j + 1 , n , m , word1 , word2 , dp);
              return dp[i][j] =  ans ;      
           }else{
              int ans = 1 + func(i + 1 , j , n , m , word1 , word2 , dp);
              ans = Math.min(ans , 1 + func(i + 1 , j + 1 , n , m , word1 , word2 , dp));
              ans = Math.min(ans , 1 + func(i , j + 1 , n , m , word1 , word2 , dp));
              return dp[i][j] =  ans ;      
           }
    }
    
    
    
    
    public int minDistance(String word1, String word2) {
           int n = word1.length() , m = word2.length() ;
        
           int [][]dp = new int[n+1][m+1] ; 
        
           for(int i = 0 ; i <= n ; ++i){
               Arrays.fill(dp[i] , -1);
           }
        
           int ans = func(0 , 0 , n , m , word1 , word2 , dp);
        
           return ans ;
        
    }
}
