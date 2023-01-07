/*

Given an integer array nums, return an array answer such that answer[i] is equal to the product of all 
the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.

*/

    public int[] productExceptSelf(int[] nums) {
      int ans[]= new int[nums.length];
      for(int i=0;i<nums.length;i++){
          ans[i]= i==0? 1: nums[i-1]*ans[i-1];
      }

         int R = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            ans[i] = ans[i] * R;
            R *= nums[i];
        }




        return ans;

    }