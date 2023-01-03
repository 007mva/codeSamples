/*
Given an integer array nums, return all the triplets 
[nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.

*/


class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
      Set<List<Integer>> set=new HashSet<>();
        Arrays.sort(nums);
        if(nums.length==0){
            return new ArrayList<>(set);
        }
        for(int i=0;i<nums.length-2;i++){
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum==0){
                    set.add(Arrays.asList(nums[i], nums[j++], nums[k--]));
                }
                else if(sum<0){
                    j++;
                }
                else if (sum>0){
                    k--;
                }
            }
        }



            return new ArrayList<>(set);
    }
}