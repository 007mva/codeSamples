/*

Given two strings s and t, determine if they are isomorphic.

Two strings s and t are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters. 
No two characters may map to the same character, but a character may map to itself.

*/


 public boolean isIsomorphic(String s, String t) {
            Map<Character, Character> maptTos=new HashMap();
            Map<Character, Character> mapsTot=new HashMap();
            for(int i=0;i<s.length();i++){
                char tc=t.charAt(i);
                char sc=s.charAt(i);
                if(mapsTot.containsKey(sc) && mapsTot.get(sc)!=tc || maptTos.containsKey(tc) && maptTos.get(tc)!=sc){
                            return false;
                }
                mapsTot.put(sc,tc);
                maptTos.put(tc,sc);
            }



            return true;

    }