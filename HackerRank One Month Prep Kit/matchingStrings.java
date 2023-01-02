/*
There is a collection of input strings and a collection of query strings. 
For each query string, determine how many times it occurs in the list of input strings. Return an array of the results.
*/

public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
    Map<String, Integer> map= new HashMap();
    for(int i=0;i<strings.size();i++){
        String s=strings.get(i);
        if(map.containsKey(s)){
            map.put(s, map.get(s)+1);
        }
        else{
            map.put(s, 1);
        }
    }
    List<Integer> l= new ArrayList();
    for(int j=0;j<queries.size();j++){
        String st=queries.get(j);
        if(map.containsKey(st)){
            l.add(map.get(st));
        }
        else {
            l.add(0);
        }
    }
        
            return l;
    }
