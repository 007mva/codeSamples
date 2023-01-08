/*

Given a pattern and a string s, find if s follows the same pattern.

Here follow means a full match, such that there is a bijection between a letter 
in pattern and a non-empty word in s.

*/

public boolean wordPattern(String pattern, String s) {
        String c[]= s.split(" ");
        if(pattern.length()!=c.length){
                return false;
        }
        HashMap map=new HashMap();
        for(Integer i=0;i<pattern.length();i++){
            char ch=pattern.charAt(i);
            String k= c[i];
            if(!map.containsKey(ch)){
                map.put(ch, i);
            }
            if(!map.containsKey(k)){
                map.put(k, i);
            }
            if(map.get(k)!=map.get(ch)) {
                    return false;
            }
        }


            return true;

    }