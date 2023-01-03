
/*
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.

*/


class Solution {
    public int singleNumber(int[] nums) {
    Set <Integer> s=new HashSet();
    int sum=0,max=0;
    for(int num:nums){
        if(s.contains(num)){
            sum+=2*num;
        }
        else{
            s.add(num);
        }
        max+=num;
    }



        return max-sum;
    }
}