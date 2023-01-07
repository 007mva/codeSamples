/*
Two children, Lily and Ron, want to share a chocolate bar. Each of the squares has an integer on it.

Lily decides to share a contiguous segment of the bar selected such that:

The length of the segment matches Ron's birth month, and,
The sum of the integers on the squares is equal to his birth day.
Determine how many ways she can divide the chocolate.

*/

 public static int birthday(List<Integer> s, int d, int m) {
    
        if(m > s.size()){
            return 0;
        }
        
        int waysToDivide =0;

        for(int i=0; i<s.size(); i++){
            
            for(int j=i; j<s.size(); j++){
                
                List<Integer> splittedBar = s.subList(i, j+1);
                
                if(splittedBar.size()== m){
                    
                    //The sum of the integers on the squares                    
                    if(splittedBar.stream().mapToInt(Integer::intValue).sum()== d){
                        
                        waysToDivide++;
                        
                    }
                    
                }
                
            }        
            
        }
        
        return waysToDivide;

}
