/*
Given an integer array nums, move all 0's to the end of it while maintaining the relative 
order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

*/

  public void moveZeroes(int[] nums) {
     if(nums.length==1) return;
     int pivot=0;
     for(int i=0;i<nums.length;i++){
         if(nums[i]!=0){
             int temp=nums[i];
             nums[i]=nums[pivot];
             nums[pivot++]=temp;
         }
     } 
    }
