public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> repeatedNumber(final List<Integer> A) {
           int n = A.size() ;
           
           int xor = 0 ;
           
           for(int i=0 ; i<n ; ++i){
               xor ^= A.get(i) ;
               xor ^= (i + 1);
           }
           
           int bt = (xor & ~(xor - 1));
           int first = 0 , second = 0 ;
           
           for(int i=0 ; i<n ; ++i){
               if((A.get(i) & (bt))!=0){
                   first ^= A.get(i);
               }else{
                   second ^= A.get(i);
               }
           }
           
           for(int i=1 ; i<=n ; ++i){
               if((i & (bt))!=0){
                   first ^= i ;
               }else{
                   second ^= i ;
               }
           }
           
           int cnt_first = 0 , cnt_second = 0;
           for(int i=0 ; i<n ; ++i){
               if(A.get(i) == first) cnt_first++;
               if(A.get(i) == second) cnt_second++;
           }
           
           ArrayList<Integer> res = new ArrayList<>();

           
           if(cnt_first > cnt_second) {
               res.add(first);
               res.add(second);
               return res ;
           }
           res.add(second);
           res.add(first);
           return res ;
           
    }
}
