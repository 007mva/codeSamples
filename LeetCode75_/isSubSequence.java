/*
Given two strings s and t, return true if s is a subsequence of t, or false otherwise.

A subsequence of a string is a new string that is formed from the 
original string by deleting some (can be none) of the characters without 
disturbing the relative positions of the remaining characters. 
(i.e., "ace" is a subsequence of "abcde" while "aec" is not).

*/

 public boolean isSubsequence(String s, String t) {
        Integer i=0, j=0;
        Integer lB=s.length() , rB=t.length();
        while(i<lB && j<rB){
            if(s.charAt(i)==t.charAt(j)){
                i+=1;
            }
            j+=1;


        }


        return i==lB;
    }