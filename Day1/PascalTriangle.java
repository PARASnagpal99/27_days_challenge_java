class Solution {
    public List<List<Integer>> generate(int numRows) {
        
           List<List<Integer>> res = new ArrayList<>() ;
        
           List<Integer> temp = new ArrayList<>() ;
           temp.add(1) ;
           res.add(temp);
        
           if(numRows <= 1) return res ;
        
           List<Integer> second = new ArrayList<>() ;
           second.add(1) ;
           second.add(1) ;

           res.add(second);
          
           for(int i=2 ; i<numRows ; ++i){
               List<Integer> temp2 = new ArrayList<>() ;
               List<Integer> prev = res.get(i-1);
               temp2.add(1);
               for(int j=1 ; j < i ; ++j){
                   temp2.add(prev.get(j) + prev.get(j-1));
               }
               temp2.add(1);
               res.add(temp2);
           }
        
           return res ;
        
    }
}
