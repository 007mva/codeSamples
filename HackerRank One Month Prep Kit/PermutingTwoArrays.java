/*
There are two n-element arrays of integers,  A and B. Permute them into some  A' and B'  
such that the relation A'[i]+B'[i]>=k  holds for all i where 0<=i<n .

There will be  queries consisting of A, B, and k. 
For each query, return YES if some permutation A', B' satisfying the relation exists. Otherwise, return NO.
*/

  public static String twoArrays(int k, List<Integer> A, List<Integer> B) {
        Collections.sort(A);
        Collections.reverse(A);
        Collections.sort(B);
        for(int i=0;i<A.size();i++){
            if(A.get(i)+B.get(i)<k)  return "NO";
              
        }   
            return "YES";
    }