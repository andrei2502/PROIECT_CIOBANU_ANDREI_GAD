package org.example;

public class leetcode771 {

    public static int numJewelsInStones(String jewels, String stones) {
        int a=0;

        for(int i=0;i<stones.length();i++){
            for(int j=0;j<jewels.length();j++){
                if(jewels.charAt(j)==stones.charAt(i) || jewels.charAt(j)==stones.charAt(i)){
                    a++;
                }
            }
        }
        return a;
    }

}
