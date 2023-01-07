/*
Given a string s, find the length of the longest 
substring
 without repeating characters.
*/
 public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set=new HashSet();
        int p1=0, p2=0,max=0;
        while(p2<s.length()){
                if(!set.contains(s.charAt(p2))){
                    set.add(s.charAt(p2));
                    p2++;
                    max=Math.max(max,set.size() );
                }   
                else {
                    set.remove(s.charAt(p1));
                    p1++;
                }


            }
        

            return max;


    }