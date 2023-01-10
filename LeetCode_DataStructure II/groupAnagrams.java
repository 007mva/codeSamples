/*
Given an array of strings strs, group the anagrams together. You can return the answer in any order.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, 
typically using all the original letters exactly once.
*/
public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length==0) return new ArrayList();
        HashMap<String, List> map=new HashMap();
        for(String s: strs){
            char[] ch= s.toCharArray();
            Arrays.sort(ch);
            if(!map.containsKey(String.valueOf(ch))) map.put(String.valueOf(ch), new ArrayList());
            map.get(String.valueOf(ch)).add(s);

        }
        return new ArrayList(map.values());
    }