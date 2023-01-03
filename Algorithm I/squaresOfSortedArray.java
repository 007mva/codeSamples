/*
Given an integer array nums sorted in non-decreasing order, 
return an array of the squares of each number sorted in non-decreasing order.
*/

public int[] sortedSquares(int[] nums) {
        int i=0, j=nums.length-1, lastIndex=nums.length-1;
        int[] ans=new int[nums.length];
        while(i<=j){
            if(Math.abs(nums[i]*nums[i])> Math.abs(nums[j]*nums[j])){
                    ans[lastIndex--]=Math.abs(nums[i]*nums[i]);
                    i++;
            }
            else {
                ans[lastIndex--]=Math.abs(nums[j]*nums[j]);
                j--;
            }
        }
        return ans;
    }