package com.bootcoding.basic.test;

public class Solution {
    public  int findDuplicate(int[] nums) {
        for(int i=0;i<nums.length;i++){

            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    return nums[i];
                }
            }

        }
        return 0;
    }


    public static void main(String[] args) {
        int[] arr ={3,1,3,4,2};
        Solution solution = new Solution();
        System.out.println(solution.findDuplicate(arr));
    }
}
