package org.example;

public class leetcode27 {

    public static int removeElement(int[] nums, int val) {
        int n=0;
        for(int i=0;i<nums.length-n;i++){
            if(nums[i]==val){
                for(int j=i;j<nums.length-n-1;j++){
                    nums[j]=nums[j+1];
                }
                n=n+1;
                i--;
            }

        }
        return nums.length-n;
    }

}
