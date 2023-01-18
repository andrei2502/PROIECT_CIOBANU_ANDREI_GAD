package org.example;

public class leetcode26 {

    public static int removeDuplicates(int[] nums) {
        int n=0;
        int m=1;
        for(int i=1;i<nums.length-n;i++){
            if(nums[i-1]!=nums[i]){
                m=m+1;
            }
            if(nums[i]==nums[i-1]){
                for(int j=i;j<nums.length-n-1;j++){
                    nums[j]=nums[j+1];
                }
                n=n+1;
                i--;
            }

        }
        return m;
    }

}
