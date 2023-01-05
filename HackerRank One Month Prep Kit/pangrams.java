/*
A pangram is a string that contains every letter of the alphabet. 
Given a sentence determine whether it is a pangram in the English alphabet. 
Ignore case. Return either pangram or not pangram as appropriate.

*/

 public static String pangrams(String s) {
    // Write your code here
    HashSet<Character> set=new HashSet();
    for(char c: s.toCharArray()){
        set.add(Character.toLowerCase(c));
    }
    char c='a';
    while(c<='z'){
        if(!set.contains(c)){
            return "not pangram";
        }
         c++;
    }
    return "pangram";
    }