package org.example;

public class leetcode1512 {

    public static int numIdenticalPairs(int[] nums) {
        int a=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    a++;
                }
            }
        }
        return a;
    }
}
